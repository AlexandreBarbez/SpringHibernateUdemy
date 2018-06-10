package com.halx.springmvc;

import com.halx.spring.utils.Utils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("/")
    public String showHomePage(){
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - HomeController => forwarding request to index template");
        return "thymeleaf/index";
    }
}
