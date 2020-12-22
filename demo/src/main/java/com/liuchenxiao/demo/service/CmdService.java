package com.liuchenxiao.demo.service;

import com.liuchenxiao.demo.dao.CmdDao;
import com.liuchenxiao.demo.dao.CmdRepository;
import com.liuchenxiao.demo.entity.Cmd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CmdService {
    @Autowired
    CmdRepository cmdRepository;

    public List<Cmd> findAll() {
        List cmdRepositoryAll = cmdRepository.findAll();
        return cmdRepositoryAll;
    }

    public Cmd  add(Cmd cmd) {

        Cmd cmd1 = cmdRepository.saveAndFlush(cmd);
        return cmd1;
    }

    public String del(Integer cmd_id) {
        try {
            cmdRepository.deleteById(cmd_id);
            return "成功";
        }catch (Exception e){
            System.out.print(e.getMessage());
            return "失败";
        }


    }
}
