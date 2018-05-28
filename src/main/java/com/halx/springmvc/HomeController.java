package com.halx.springmvc;

import com.halx.spring.utils.Utils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage(){
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - HomeController => forwarding request to index template");
        return "index";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String showTestPage(){
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - HomeController => forwarding request to test template");
        return "test";
    }

}
