package com.halx.springmvc;

import com.halx.spring.utils.Utils;
import com.halx.springmvc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/thymeLeafForm")
public class ThymLeafFormController {
    @Autowired
    private Student student;

    @GetMapping("/loginForm")
    public String showForm(Model model){
        model.addAttribute("student",student);

        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - ThymeLeafFormController => forwarding request to loginForm template");
        return "thymeleaf/loginForm";
    }

    @PostMapping("/loginForm")
    public String processForm(HttpServletRequest request, @RequestParam("firstName") String firstName , @ModelAttribute Student student){

        student.setFirstName(student.getFirstName().toUpperCase());

        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - ThymeLeafFormController => Manipulating the request multiples ways :");
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - ThymeLeafFormController => HttpServletRequest.getParameter : "+request.getParameter("firstName"));
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - ThymeLeafFormController => @RequestParam : "+firstName);
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - ThymeLeafFormController => @ModelAttribute : "+student.getFirstName());

        return "thymeleaf/displayInfo";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String processForm(){
        return "hello you from ThymLeafFormController";
    }
}
