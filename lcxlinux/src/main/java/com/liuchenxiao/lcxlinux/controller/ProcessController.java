package com.liuchenxiao.lcxlinux.controller;

import com.liuchenxiao.lcxlinux.pojo.ProcessTable;
import com.liuchenxiao.lcxlinux.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("Prcoess")
public class ProcessController {

    @Autowired
    ProcessService processService;

    @RequestMapping("ListProcess")
    public String ListProcess(Model model){

         List<ProcessTable> disNameList = processService.findDisName();

        model.addAttribute("disNameList",disNameList);

    return "index";
    }

    @RequestMapping("ProcessSingle")
    public String ProcessSingle(@RequestParam String processName, Model model){

        System.out.println("*****--------"+processName+"------************");
        List<ProcessTable> ProcessSingleList = processService.findProcessSingleAll(processName);
        List<ProcessTable> disNameList = processService.findDisName();

        model.addAttribute("disNameList",disNameList);
        model.addAttribute("ProcessSingleList",ProcessSingleList);

        return "processSinglel";
    }

    @RequestMapping("ProcessQueryStatus")

    public String ProcessQueryStatus(@RequestParam Integer processId, Model model){

       String result= processService.ProcessQueryStatus(processId);

        List<ProcessTable> ProcessSingleList = processService.findProcessSinglePIdAll(processId);
        List<ProcessTable> disNameList = processService.findDisName();

        model.addAttribute("disNameList",disNameList);
        model.addAttribute("ProcessSingleList",ProcessSingleList);

        model.addAttribute("result",result);

         return "processSinglel";
    }
    @RequestMapping("ProcessStart")
    public String ProcessStart(@RequestParam Integer processId, Model model){
        String result= processService.ProcessStart(processId);

        List<ProcessTable> ProcessSingleList = processService.findProcessSinglePIdAll(processId);
        List<ProcessTable> disNameList = processService.findDisName();

        model.addAttribute("disNameList",disNameList);
        model.addAttribute("ProcessSingleList",ProcessSingleList);

        model.addAttribute("result",result);

         return "processSinglel";
    }
    @RequestMapping("ProcessStop")
    public String ProcessStop(@RequestParam Integer processId, Model model){

        String result= processService.ProcessStop(processId);

        List<ProcessTable> ProcessSingleList = processService.findProcessSinglePIdAll(processId);
        List<ProcessTable> disNameList = processService.findDisName();

        model.addAttribute("disNameList",disNameList);
        model.addAttribute("ProcessSingleList",ProcessSingleList);

        model.addAttribute("result",result);


        return "processSinglel";
    }
}
