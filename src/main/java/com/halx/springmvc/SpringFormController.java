package com.halx.springmvc;

import com.halx.spring.utils.Utils;
import com.halx.springmvc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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

    /**
     * For each web request : pre-process to trim Strings
     * @param dataBinder
     */
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        //Object from spring framework to trim strings
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        //we apply this trim object to every String passed in the webRequest
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }
}
