package com.halx.springmvc;

import com.halx.spring.utils.Utils;
import com.halx.springmvc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


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
    public String processForm(HttpServletRequest request,@RequestParam("name") String name ,@ModelAttribute Student student){

        student.setName(student.getName().toUpperCase());

        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - HomeController => Manipulating the request multiples ways :");
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - HomeController => HttpServletRequest.getParameter : "+request.getParameter("name"));
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - HomeController => @RequestParam : "+name);
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - HomeController => @ModelAttribute : "+student.getName());

        return "helloWorld";
    }
}
