package com.liuchenxiao.lcxlinux.service;

import ch.ethz.ssh2.ChannelCondition;
import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

class LinuxUtils3 {

    private static final Logger log = LoggerFactory.getLogger(LinuxUtils3.class);
    private static String  DEFAULTCHART="UTF-8";

    /**
     * 登录主机 
     * @return
     *      登录成功返回true，否则返回false 
     */
    public static Map login(String ip, String userName, String userPwd){

        boolean flg=false;
        Connection conn = null;
        Map<Object,Object> map= new HashMap();
        try {
            conn = new Connection(ip);
            conn.connect();//连接  
            flg=conn.authenticateWithPassword(userName, userPwd);//认证  
            if(flg){
                log.info("=========登录成功========="+conn);
                map.put("1","success");
                map.put("2",conn);
                return map;
            }else {
                map.put("1","false");
                map.put("2",conn);
                return map;
            }
        } catch (IOException e) {
            log.error("=========登录失败========="+e.getMessage());
            map.put("1","false");
            map.put("2",conn);
            return map;
             }

    }

    /**
     * 远程执行shll脚本或者命令 
     * @param cmd
     *      即将执行的命令 
     * @return
     *      命令执行完后返回的结果值
     */
    public static String execute(Connection conn, String cmd){
        String result="";
        int ret = -1;
        try {
            if(conn !=null){
                System.out.println("*********打开会话****************");
                Session session= conn.openSession();//打开一个会话
               // 建立虚拟终端
                session.requestPTY("bash");
               // 打开一个Shell
                session.startShell();
                // 准备输入命令
                PrintWriter out = new PrintWriter(session.getStdin());
                // 输入待执行命令
                out.println(cmd);

                out.println("exit");
                // 6. 关闭输入流
                 out.close();
                 // 7. 等待，除非1.连接关闭；2.输出数据传送完毕；3.进程状态为退出；4.超时
                session.waitForCondition(ChannelCondition.CLOSED |
                        ChannelCondition.EOF | ChannelCondition.EXIT_STATUS , 30000);

                log.info("开始调shell返回");
                result=procesStdout(session.getStdout(),DEFAULTCHART);
                //如果为得到标准输出为空，说明脚本执行出错了
                if(StringUtils.isBlank(result)){
                    log.info("得到标准输出为空,链接conn:"+conn+",执行的命令："+cmd);
                    result="无输出请点击查询";
                    log.info("******result**********"+result);

                }else{
                    log.info("执行命令成功,链接conn:"+conn+",执行的命令："+cmd);
                    log.info("******result**********"+result);
                }

                /* Show exit status, if available (otherwise "null") */
                System.out.println("ExitCode: " + session.getExitStatus());
//                ret = session.getExitStatus();

                session.close();/* Close this session */
                log.info(",执行的命令：关闭session");
                conn.close();/* Close the connection */
                log.info(",执行的命令：关闭conn");
            }

        } catch (IOException e) {
            log.info("执行命令失败,链接conn:"+conn+",执行的命令："+cmd+"  "+e.getMessage());
            e.printStackTrace();
        }finally {
            if (conn != null) {
                conn.close();
            }
//            IOUtils.closeQuietly(stdOut);
//            IOUtils.closeQuietly(stdErr);
        }
         return result;
    }
    /**
     * 解析脚本执行返回的结果集 
     * @param in 输入流对象 
     * @param charset 编码 
     * @return
     *       以纯文本的格式返回
     */
    private static String procesStdout(InputStream in, String charset){
        InputStream  stdout = new StreamGobbler(in);
        StringBuffer buffer = new StringBuffer();;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(stdout,charset));
            String line=null;
            while((line=br.readLine()) != null){
                buffer.append(line+"\n");
            }
        } catch (UnsupportedEncodingException e) {
            log.error("解析脚本出错："+e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            log.error("解析脚本出错："+e.getMessage());
            e.printStackTrace();
        }
        return buffer.toString();
    }
}

