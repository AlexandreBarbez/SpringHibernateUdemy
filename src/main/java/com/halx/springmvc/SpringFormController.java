package com.halx.springmvc;

import com.halx.spring.utils.Utils;
import com.halx.springmvc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springForm")
public class SpringFormController {

    @Autowired
    Student student;

    @RequestMapping("/loginForm")
    public String showSpringForm(){

        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - SpringFormController => forwarding request to jsp-student-form jsp");
        return "jsp/student-form";
    }

    @RequestMapping("/processForm")
    public String processSpringForm(@ModelAttribute("student") Student theStudent){

        System.out.println("theStudent: " + theStudent.getFirstName());
        return "jsp/student-confirmation";

    }
}
