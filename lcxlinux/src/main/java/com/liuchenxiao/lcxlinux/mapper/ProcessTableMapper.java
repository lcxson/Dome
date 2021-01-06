package com.liuchenxiao.lcxlinux.mapper;

import com.liuchenxiao.lcxlinux.pojo.ProcessTable;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ProcessTableMapper继承基类
 */

@Mapper
@Repository
public interface ProcessTableMapper extends MyBatisBaseDao<ProcessTable, Integer, ProcessTableExample> {

    public List<ProcessTable> findDisName();

}