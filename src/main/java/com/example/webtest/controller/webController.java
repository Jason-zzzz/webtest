package com.example.webtest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/test")
public class webController {

    @RequestMapping("/helloworld")
    public String helloworld(){
        return "helloworld";
    }

}