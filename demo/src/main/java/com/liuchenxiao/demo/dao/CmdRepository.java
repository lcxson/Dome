package com.liuchenxiao.demo.dao;

import com.liuchenxiao.demo.entity.Cmd;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CmdRepository extends JpaRepository<Cmd ,Integer>{

}
