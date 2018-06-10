package com.halx.springmvc.model;

import com.halx.spring.utils.Utils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    private String firstName;
    private String lastName;

    public Student() {
        System.out.println(Utils.getDateFormattedLikeSpringBoot() + " - Student : in no-arg constructor");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println(Utils.getDateFormattedLikeSpringBoot() + " - Student : in setter to instantiate Student with " + firstName + " as firstName.");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        System.out.println(Utils.getDateFormattedLikeSpringBoot() + " - Student : in setter to instantiate Student with " + lastName + " as lastName.");
        this.lastName = lastName;
    }
}
