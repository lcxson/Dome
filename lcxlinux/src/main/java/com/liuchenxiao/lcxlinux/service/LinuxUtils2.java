package com.liuchenxiao.lcxlinux.service;


import ch.ethz.ssh2.ChannelCondition;
import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

class LinuxUtils2 {

    private static final Logger log = LoggerFactory.getLogger(LinuxUtils2.class);
    private static String DEFAULTCHART = "UTF-8";

    /**
     * 登录主机
     *
     * @return 登录成功返回true，否则返回false
     */
    public static Map login(String ip, String userName, String userPwd) {

        boolean flg = false;
        Connection conn = null;
        Map<Object, Object> map = new HashMap();
        try {
            conn = new Connection(ip);
            conn.connect();//连接  
            flg = conn.authenticateWithPassword(userName, userPwd);//认证
            if (flg) {
                log.info("=========登录成功=========" + conn);
                map.put("1", "success");
                map.put("2", conn);
                return map;
            } else {
                map.put("1", "false");
                map.put("2", conn);
                return map;
            }
        } catch (IOException e) {
            log.error("=========登录失败=========" + e.getMessage());
            map.put("1", "false");
            map.put("2", conn);
            return map;
        }

    }

    /**
     * 远程执行shll脚本或者命令
     *
     * @param cmd 即将执行的命令
     * @return 命令执行完后返回的结果值
     */
    public static String execute(Connection conn, String cmd) {
        String result = "";
        try {
            if (conn != null) {
                System.out.println("*********打开会话****************");
                // 通过session.requestDumbPTY()和session.startShell()来模拟bai命令行，在通过io流操作
                Session session = conn.openSession();
                session.requestDumbPTY();
                session.startShell();
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(session.getStdin()));
                bw.write("source .bash_profile" + "\n\r");

                bw.write(cmd + "\n\r");
                log.info(",执行的命令：" + cmd + " 等待2s " );
                Thread.sleep(2000);

                bw.write("\n\r");
                log.info(",执行的命令：/n/t" + cmd + " 等待1s " );

                Thread.sleep(1000);
                //如果为得到标准输出为空，说明脚本执行出错了
                bw.flush();
                while (true) {
                    if ((session.getStdout().available() == 0) && (session.getStderr().available() == 0)) {
                        int conditions = session.waitForCondition(ChannelCondition.STDOUT_DATA | ChannelCondition.STDERR_DATA
                                | ChannelCondition.EOF, 2000);
                        if ((conditions & ChannelCondition.EOF) != 0) {
                            if ((conditions & (ChannelCondition.STDOUT_DATA | ChannelCondition.STDERR_DATA)) == 0) {
                                break;
                            }
                        }
                    }
                }

                BufferedReader br = new BufferedReader(new InputStreamReader(session.getStdout()));
                while (true) {
                    String answer = br.readLine();
                    if (answer != null) {
                        log.info("socket", "message call: " + answer);
                    } else {
                        break;
                    }
                }

                BufferedReader brErr = new BufferedReader(new InputStreamReader(session.getStderr()));
                while (true) {
                    String answer = brErr.readLine();
                    if (answer != null) {
                        log.info("socket", "execute: answer error = " + answer);
                    } else {
                        break;
                    }
                }

                session.close();
                log.info(",执行的命令：关闭session");
                conn.close();
                log.info(",执行的命令：关闭conn");
            }
        } catch (IOException | InterruptedException e) {
            log.info("执行命令失败,链接conn:" + conn + ",执行的命令：" + cmd + "  " + e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 解析脚本执行返回的结果集
     *
     * @param in      输入流对象
     * @param charset 编码
     * @return 以纯文本的格式返回
     */
    private static String procesStdout(InputStream in, String charset) {
        InputStream stdout = new StreamGobbler(in);
        StringBuffer buffer = new StringBuffer();
        ;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(stdout));

            String line=null;
            while((line=br.readLine()) != null){
                buffer.append(line+"\n");
               // log.info("socket"+buffer.toString());
            }

        } catch (UnsupportedEncodingException e) {
            log.error("解析脚本出错：" + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            log.error("解析脚本出错：" + e.getMessage());
            e.printStackTrace();
        }
        return buffer.toString();
    }
}
