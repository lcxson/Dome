package com.liuchenxiao.demo.controller;
import ch.qos.logback.core.net.SyslogOutputStream;
import com.liuchenxiao.demo.entity.Cmd;
import com.liuchenxiao.demo.service.CmdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CmdController {

    @Autowired
    CmdService cmdService;
    @RequestMapping("/list")
    public String list(Model model) {

        List<Cmd> list = cmdService.findAll();

       /* for (Cmd cmd:list ) {
            model.addAttribute("list",cmd.toString());
            System.out.println(cmd.getCmd_id());
            System.out.println(cmd.toString());
        }*/
        model.addAttribute("list",list);
        return "add";
    }

   @RequestMapping("/add")
    public String add(@ModelAttribute Cmd cmd, Model model) {
       System.out.println("========1===========:"+cmd.toString());
       Cmd cmd1 = cmdService.add(cmd);
       List<Cmd> list = cmdService.findAll();
       System.out.println("========2===========:"+cmd1.toString());
       model.addAttribute("massage",cmd1);
       model.addAttribute("list",list);
       System.out.println("========3===========");
        return "add";
    }
    @RequestMapping("/del")
    public String del(@RequestParam("cmd_id") Integer cmd_id,Model model) {
        String strdel = cmdService.del(cmd_id);
        List<Cmd> list = cmdService.findAll();
        model.addAttribute("list",list);
        model.addAttribute("strdel",strdel);
        return "add";
    }
}
