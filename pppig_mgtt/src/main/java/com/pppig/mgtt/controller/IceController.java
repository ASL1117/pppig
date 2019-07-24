package com.pppig.mgtt.controller;

import com.pppig.mgtt.pojo.Ice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class IceController {

    @FeignClient
    @RequestMapping("/ice")
    public String ice(Ice ice, Model model){
        log.info("A——" + ice.getA(),  "B——"+ ice.getB(), "ice");

        ice.setC("3");
        model.addAttribute("ice", ice);

        return "sabo";
    }

    @RequestMapping("/sabo")
    public String sabo(Ice ice, Model model){
        log.info("A——" + ice.getA(),  "B——"+ ice.getB(), "sabo");

        if (ice.getC().equals("3")){
            model.addAttribute("status", "success");
        }else{
            model.addAttribute("status", "fail");
        }
        return "luffy";
    }

    /*@RequestMapping("/luffy")
    public String luffy(Ice ice, Model model){
        if (ice.getA().equals("1")){
            model.addAttribute("status", "success");
        }
        model.addAttribute("status", "fail");
        return "luffy";
    }*/
}
