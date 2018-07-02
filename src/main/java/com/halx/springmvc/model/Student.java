package com.halx.springmvc.model;

import com.halx.spring.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.LinkedHashMap;

@Component
@PropertySource("classpath:countries.properties")
@ConfigurationProperties("country")
public class Student {
    private String firstName;
    private String lastName;

    LinkedHashMap<String, String> countriesOptions;

    private String country;

    public Student() {
        System.out.println(Utils.getDateFormattedLikeSpringBoot() + " - Student : in no-arg constructor for "+this);
    }

    public String getFirstName() {

        System.out.println(Utils.getDateFormattedLikeSpringBoot() + " - Student : in Student "+this+" getter to return " + firstName + " as firstName.");
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println(Utils.getDateFormattedLikeSpringBoot() + " - Student : in "+this+" setter to instantiate Student with " + firstName + " as firstName.");
        this.firstName = firstName;
    }

    public String getLastName() {

        System.out.println(Utils.getDateFormattedLikeSpringBoot() + " - Student : in Student "+this+" getter to return " + lastName + " as lastName.");
        return lastName;
    }

    public void setLastName(String lastName) {
        System.out.println(Utils.getDateFormattedLikeSpringBoot() + " - Student : in "+this+" setter to instantiate Student with " + lastName + " as lastName.");
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountriesOptions() {
        return countriesOptions;
    }

    public void setCountriesOptions(LinkedHashMap<String, String> countryOptions) {
        this.countriesOptions = countryOptions;
    }

}
