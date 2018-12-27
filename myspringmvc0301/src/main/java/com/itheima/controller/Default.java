package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("default")
public class Default {

    @RequestMapping("gotoResult")
    public String gotoResult(Model model){
        Date date = new Date();
        model.addAttribute("nowDate",date);
        return "result";
    }
}
