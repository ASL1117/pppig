package com.pppig.mgtt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jump")
public class JumpController {

    @RequestMapping("/toLoanList")
    public String toLoanList(){
        return "loanList";
    }
}
