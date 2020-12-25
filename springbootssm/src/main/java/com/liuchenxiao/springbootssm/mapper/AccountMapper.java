package com.liuchenxiao.springbootssm.mapper;

import com.liuchenxiao.springbootssm.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

/**
 * AccountMapper继承基类
 */
@Mapper
@Service
public interface AccountMapper extends MyBatisBaseDao<Account, Integer, AccountExample> {
}