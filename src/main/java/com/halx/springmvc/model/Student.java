package com.halx.springmvc.model;

import com.halx.spring.utils.Utils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    private String name;

    public Student() {
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - Student : in no-arg constructor");
    }

    public void setName(String name) {
        System.out.println(Utils.getDateFormattedLikeSpringBoot()+" - Student : in setter to instantiate Student with "+name+" as name.");
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
