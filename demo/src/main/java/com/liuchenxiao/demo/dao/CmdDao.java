package com.liuchenxiao.demo.dao;

import com.liuchenxiao.demo.entity.Cmd;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CmdDao {
    public List<Cmd> findAll() {
        Cmd cmd =new Cmd() ;
        cmd.setCmd_id(1);
        cmd.setStart_shell("start");
        cmd.setStop_shell("stop");
        cmd.setStatus_shell("status");
       List  list =new ArrayList<Cmd>();
       list.add(cmd);

        return list;
    }

    public int save(Cmd cmd) {

        return 0;
    }
}
