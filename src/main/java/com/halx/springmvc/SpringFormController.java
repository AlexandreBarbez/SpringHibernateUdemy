package com.halx.springmvc;

import com.halx.spring.utils.Utils;
import com.halx.springmvc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/springForm")
public class SpringFormController {

    @Autowired
    Student theStudent;

    @RequestMapping("/loginForm")
    public String showSpringForm(Model theModel){
        theModel.addAttribute("student", theStudent);
        return "jsp/student-form";
    }

    @RequestMapping("/processForm")
    public String processSpringForm(@Valid @ModelAttribute("student") Student theReturnedStudent, BindingResult bindingResult, Model theModel){
        String mapping;
        if(bindingResult.hasErrors()){
            mapping = "jsp/student-form";
        }else{
            mapping = "jsp/student-confirmation";
        }

        return mapping;

    }
}
