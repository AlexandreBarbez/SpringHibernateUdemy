package com.halx.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("love")
public class SecondController {

    @RequestMapping("/hello")
    @ResponseBody
    public String processForm(){
        return "hello you from SecondController";
    }
}
