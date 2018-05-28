package com.halx.springmvc;

import com.halx.spring.utils.Utils;
import com.halx.springmvc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    private Student student;

    @RequestMapping("/")
    public String showHomePage(){
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - HomeController => forwarding request to index template");
        return "index";
    }

    @GetMapping("/loginForm")
    public String showForm(Model model){
        model.addAttribute("student",student);
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - HomeController => forwarding request to loginForm template");
        return "loginForm";
    }

    @PostMapping("/loginForm")
    public String processForm(@ModelAttribute Student student){
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - HomeController => forwarding request to helloWorld template");
        return "helloWorld";
    }


}
