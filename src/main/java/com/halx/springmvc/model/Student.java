package com.halx.springmvc.model;

import com.halx.spring.utils.Utils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.LinkedHashMap;

@Component
@PropertySource("classpath:student.properties")
@ConfigurationProperties("student")
public class Student {
    @NotNull
    @Size(min=1, message="is required")
    private String firstName;
    @NotNull
    @Size(min=1, message="is required")
    private String lastName;

    private String language;
    private String country;

    LinkedHashMap<String, String> countriesOptions;
    LinkedHashMap<String, String> languagesOptions;

    String[] operatingSystems;

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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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

    public void setCountriesOptions(LinkedHashMap<String, String> countryOptions) { this.countriesOptions = countryOptions; }

    public LinkedHashMap<String, String> getLanguagesOptions() { return languagesOptions; }

    public void setLanguagesOptions(LinkedHashMap<String, String> languagesOptions) { this.languagesOptions = languagesOptions; }

    public String[] getOperatingSystems() { return operatingSystems; }

    public void setOperatingSystems(String[] operatingSystems) { this.operatingSystems = operatingSystems; }
}
