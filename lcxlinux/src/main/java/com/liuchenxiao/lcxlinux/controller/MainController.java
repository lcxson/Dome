package com.liuchenxiao.lcxlinux.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Main")
public class MainController {

    @RequestMapping("/index")
    public String index(){

        return "index";
    }
}

