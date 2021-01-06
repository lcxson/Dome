package com.liuchenxiao.lcxlinux.mapper;

import com.liuchenxiao.lcxlinux.pojo.HostTable;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * HostTableMapper继承基类
 */
@Mapper
@Repository
public interface HostTableMapper extends MyBatisBaseDao<HostTable, Integer, HostTableExample> {
}