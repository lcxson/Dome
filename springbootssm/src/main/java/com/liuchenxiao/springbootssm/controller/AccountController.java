package com.liuchenxiao.springbootssm.controller;

import com.liuchenxiao.springbootssm.pojo.Account;
import com.liuchenxiao.springbootssm.pojo.StatusDataMsg;
import com.liuchenxiao.springbootssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;
//查询
    @RequestMapping("list")
    //@ResponseBody
    public String list(@RequestParam(defaultValue = "1") Integer pageNum,@RequestParam(defaultValue = "1") Integer pageSize, Model model){

        List<Account> accounts = accountService.findByPage(pageNum,pageSize);
        List<Account> accounts1= accountService.findAll();
        model.addAttribute("accounts",accounts);
        model.addAttribute("accounts1",accounts1);
        return "account/list";
    }


//添加
    @RequestMapping("add")
    @ResponseBody
    public Object add(@RequestParam("userName") String userName,@RequestParam("password") String password){

        String account = accountService.add(userName,password);
        return account;
    }
//分页
    @RequestMapping("findByPage")
    @ResponseBody
    public List<Account> findByPage(@RequestParam("pageNum") Integer pageNum,@RequestParam("pageSize") Integer pageSize){

        List<Account> accounts = accountService.findByPage(pageNum,pageSize);

        return accounts;
    }
    //拼接查询
    @RequestMapping("findById")
    @ResponseBody
    public List<Account> findById(@RequestParam("Id") Integer Id ){

        List<Account> accounts = accountService.findById(Id);

        return accounts;
    }


    @GetMapping("/verify")
    public String registerG(@RequestParam String loginName,@RequestParam String Password){

        System.out.println(loginName);
        System.out.println(Password);
        return  "login";
    }

    @PostMapping("/verify")
    @ResponseBody
    public String registerP(@ModelAttribute Account account , HttpServletRequest request){

        StatusDataMsg msg = accountService.verifyAcct(account);

        if(msg.getMsgCode()=="500"){
            return  msg.getErrMsg();
        }
         if(msg.getMsgCode()=="200"){
             request.getSession().setAttribute("account",account);
            return msg.getMsg();
        }
        return "";
    }

    @RequestMapping("/loginOut")
    public String loginOut(HttpServletRequest request){
        request.getSession().removeAttribute("account");
        return  "index";
    }
}
