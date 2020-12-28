package com.mtons.mblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mq
 * @description: TODO
 * @title: MqController
 * @projectName mblog
 * @date 2020/12/2811:33
 */
@Controller
@RequestMapping("/mq")
public class MqController {

    @GetMapping("/index")
    public String mqIndex(){
        return "/mq/index";
    }
}
