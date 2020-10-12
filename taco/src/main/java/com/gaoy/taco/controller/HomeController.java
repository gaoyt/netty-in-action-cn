package com.gaoy.taco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Gy
 * @description
 * @created 2020/10/12
 */
@Controller
@RequestMapping("home")
public class HomeController {

    @GetMapping("")
    public String index(){
        return "home";
    }

    @GetMapping("/")
    public String maj(){
        return "maj";
    }

    @GetMapping("/data")
    @ResponseBody
    public Map majData(){
        Map m = new HashMap();
        m.put("dd",12);
        m.put("cc",14);
        m.put("aa",18);
        return m;
    }
}
