package com.lpf.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("sessionu4")
public class UserController {

    @RequestMapping(value = "testuser",params = {"a1","a2"})
    public String test1(){
        System.out.println("test1..............");
        return "success";
    }

}
