package com.liuchenxiao.springbootssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Main")
public class MainController {

     @RequestMapping("/account/login")
    public String login(){

        return "account/login";
    }
    @RequestMapping("/index")
    public String index(){

        return "index";
    }

}
