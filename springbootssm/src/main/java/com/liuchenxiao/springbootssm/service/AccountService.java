package com.liuchenxiao.springbootssm.service;

import com.github.pagehelper.PageHelper;
import com.liuchenxiao.springbootssm.mapper.AccountMapper;
import com.liuchenxiao.springbootssm.pojo.Account;
import com.liuchenxiao.springbootssm.mapper.AccountExample;
import com.liuchenxiao.springbootssm.pojo.StatusDataMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountMapper mapper;

    public List<Account> selectByExample(AccountExample example) {
        List<Account> accounts = mapper.selectByExample(example);
        return  accounts;
    }

    public String add(String userName, String password) {

        Account example = new Account();

        example.setUserName(userName);
        example.setPassword(password);
        int i = mapper.insert(example);
        if(i==1){
            return "成功";
        }else {
            return "失败";
        }

    }

    public List<Account> findByPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        AccountExample accountExample = new AccountExample();
        List<Account> accounts = mapper.selectByExample(accountExample);
        return accounts;

    }

    public List<Account> findById(Integer id) {
        AccountExample accountExample = new AccountExample();
        accountExample.createCriteria().andIdEqualTo(id);
        List<Account> accounts = mapper.selectByExample(accountExample);
        return accounts;
    }

    public String verify(String loginName, String password) {
        AccountExample accountExample = new AccountExample();
        accountExample.createCriteria().andUserNameEqualTo(loginName).andPasswordEqualTo(password);
        List<Account> accounts = mapper.selectByExample(accountExample);
        if(accounts.size()==1){
            return "成功";
        }else {
            return "失败";
        }

    }

    public StatusDataMsg verifyAcct(Account account) {
        AccountExample accountExample = new AccountExample();
        accountExample.createCriteria().andUserNameEqualTo(account.getUserName()).andPasswordEqualTo(account.getPassword());
         List<Account> accounts = mapper.selectByExample(accountExample);
         StatusDataMsg statusDataMsg = new StatusDataMsg();
         if(accounts.size()==1){
             Account account1 = accounts.get(0);
            statusDataMsg.setAccount(account1);
            statusDataMsg.setMsgCode("200");
            statusDataMsg.setMsg("success");
            return  statusDataMsg;
        }else {
             statusDataMsg.setMsgCode("500");
             statusDataMsg.setErrMsg("failure");
            return statusDataMsg;
        }
    }

    public List<Account> findAll() {
        AccountExample accountExample = new AccountExample();
        List<Account> accounts1 = mapper.selectByExample(accountExample);
        return accounts1;
    }
}
