package com.pppig.mgtt.controller;

import com.pppig.mgtt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/companyLoanUser")
    public String companyLoanUser(Model model){
        model.addAttribute("a", "a");
        return "loanList";
    }

    @RequestMapping("/a")
    @ResponseBody
    public String a(){
        return "a";
    }
}
