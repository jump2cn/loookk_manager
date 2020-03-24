package com.jump2cn.loookk.manager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/")
    public String login() {
        return "hello";
    }

    @RequestMapping("/login")
    public String doLogin(String name, String pwd) {
        return  "true";
    }
}
