package com.liuchenxiao.springbootssm.mapper;

import com.liuchenxiao.springbootssm.pojo.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


/**
 * MenuMapper继承基类
 */
@Mapper
@Repository
public interface MenuMapper extends MyBatisBaseDao<Menu, Integer, MenuExample> {
}