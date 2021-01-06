package com.liuchenxiao.lcxlinux.service;

import ch.ethz.ssh2.Connection;
import com.liuchenxiao.lcxlinux.mapper.HostTableExample;
import com.liuchenxiao.lcxlinux.mapper.HostTableMapper;
import com.liuchenxiao.lcxlinux.mapper.ProcessTableExample;
import com.liuchenxiao.lcxlinux.mapper.ProcessTableMapper;
import com.liuchenxiao.lcxlinux.pojo.HostTable;
import com.liuchenxiao.lcxlinux.pojo.ProcessTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProcessService {

    @Autowired
    ProcessTableMapper processsMapper;

    @Autowired
    HostTableMapper hostTableMapper;


    public  List<ProcessTable> findDisName(){

        System.out.println("-------------开始执行sql------------");
        List<ProcessTable> disNameList = processsMapper.findDisName();
        System.out.println("-----------返回-----------:"+disNameList.toString());
        return disNameList;
    };

    public List<ProcessTable> findAll() {

        ProcessTableExample e =new ProcessTableExample();

        List<ProcessTable> processTablesList = processsMapper.selectByExample(e);
        return processTablesList;
    }

    public List<ProcessTable> findProcessSingleAll(String processName) {
        ProcessTableExample e =new ProcessTableExample();
        e.createCriteria().andProcessNameEqualTo(processName);
        List<ProcessTable> ProcessSingleList = processsMapper.selectByExample(e);
        System.out.println("**********---------"+ProcessSingleList.toString()+"---------------*****");
        return ProcessSingleList;
    }

    public String ProcessQueryStatus(Integer processId) {

        //根据processId查host_ip
        HostTableExample e =new HostTableExample();
        ProcessTable processPojo = processsMapper.selectByPrimaryKey(processId);
        String host_ip=processPojo.getHostIp();

        //根据host_ip查hostTable
        e.createCriteria().andHostIpEqualTo(host_ip);
        List<HostTable> hostList = hostTableMapper.selectByExample(e);
        HostTable hostTable = hostList.get(0);

        System.out.println("************开始连接*************");
        Map<Object ,Object> login = LinuxUtils3.login(hostTable.getHostIp(), hostTable.getHostName(), hostTable.getPassword());
        System.out.println("*************"+login.get("1")+"*************");
        String flag = (String) login.get("1");
         if( flag=="success"){
            System.out.println("***********连接成功************");
             Connection login1 =(Connection)login.get("2");
            String result = LinuxUtils3.execute(login1, processPojo.getProcessSel());

             return result;
        }else {
             System.out.println("***********连接失败************");
             return "连接失败";
         }

    }

    public List<ProcessTable> findProcessSinglePIdAll(Integer processId) {
        ProcessTableExample e =new ProcessTableExample();
        e.createCriteria().andProcessIdEqualTo(processId);

        List<ProcessTable> ProcessSingleList = processsMapper.selectByExample(e);

        ProcessTable processTable = ProcessSingleList.get(0);
        String processName = processTable.getProcessName();
        ProcessTableExample e1 =new ProcessTableExample();
        e1.createCriteria().andProcessNameEqualTo(processName);
        List<ProcessTable> processTables = processsMapper.selectByExample(e1);

        System.out.println("**********---------"+ProcessSingleList.toString()+"---------------*****");
        return processTables;
    }

    public String ProcessStart(Integer processId) {

        //根据processId查host_ip
        HostTableExample e =new HostTableExample();
        ProcessTable processPojo = processsMapper.selectByPrimaryKey(processId);
        String host_ip=processPojo.getHostIp();

        //根据host_ip查hostTable
        e.createCriteria().andHostIpEqualTo(host_ip);
        List<HostTable> hostList = hostTableMapper.selectByExample(e);
        HostTable hostTable = hostList.get(0);

        System.out.println("************开始连接*************");
        Map<Object ,Object> login = LinuxUtils3.login(hostTable.getHostIp(), hostTable.getHostName(), hostTable.getPassword());
        System.out.println("*************"+login.get("success")+"*************");
        String flag = (String) login.get("1");
        if( flag=="success"){
            System.out.println("***********连接成功************");
            String result = LinuxUtils3.execute((Connection)login.get("2"), processPojo.getProcessStart());
            return result;
        }else {
            System.out.println("***********连接失败************");
            return "连接失败";
        }

    }

    public String ProcessStop(Integer processId) {

        //根据processId查host_ip
        HostTableExample e =new HostTableExample();
        ProcessTable processPojo = processsMapper.selectByPrimaryKey(processId);
        String host_ip=processPojo.getHostIp();

        //根据host_ip查hostTable
        e.createCriteria().andHostIpEqualTo(host_ip);
        List<HostTable> hostList = hostTableMapper.selectByExample(e);
        HostTable hostTable = hostList.get(0);

        System.out.println("************开始连接*************");
        Map<Object ,Object> login = LinuxUtils.login(hostTable.getHostIp(), hostTable.getHostName(), hostTable.getPassword());
        System.out.println("*************"+login.get("success")+"*************");
        String flag = (String) login.get("1");
        if( flag=="success"){
            System.out.println("***********连接成功************");
            String result = LinuxUtils.execute((Connection)login.get("2"), processPojo.getProcessStop());
            return result;
        }else {
            System.out.println("***********连接失败************");
            return "连接失败";
        }
    }

}
