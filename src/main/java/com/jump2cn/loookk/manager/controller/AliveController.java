package com.jump2cn.loookk.manager.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class AliveController {

    @RequestMapping(value="/alive", method=RequestMethod.GET)
    public boolean aliveCheck() {
        return true;
    }
}
