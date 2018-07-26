package com.halx.springmvc.model;

import com.halx.spring.utils.Utils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.validation.constraints.*;
import java.util.LinkedHashMap;

@Component
//@PropertySource("classpath:student.properties")
//@ConfigurationProperties("student")
public class Student {
    @NotNull
    @Size(min=1, message="is required")
    private String firstName;

    @NotNull
    @Size(min=1, message="is required")
    private String lastName;

    private String language;
    private String country;

    @Pattern(regexp = "^[a-z1-Z0-9]{5}", message="only 5 chars/digits")
    private String postalCode;

    @Min(value=0, message=" must be > 0")
    @Max(value=100, message=" must be <= 100")
    private int masterPercentage;

    LinkedHashMap<String, String> countriesOptions;
    LinkedHashMap<String, String> languagesOptions;

    String[] operatingSystems;

    public Student() {
        System.out.println(Utils.getDateFormattedLikeSpringBoot() + " - Student : in no-arg constructor for "+this);
        this.countriesOptions = new LinkedHashMap<>();
        this.countriesOptions.put("FR", "France");
        this.countriesOptions.put("US", "United States");

        this.languagesOptions = new LinkedHashMap<>();
        this.languagesOptions.put("Java", "Java");
        this.languagesOptions.put("C#", "C sharp");
        this.languagesOptions.put("Python", "Python");
    }
    public String getFirstName() {
        System.out.println(Utils.getDateFormattedLikeSpringBoot() + " - Student : in Student "+this+" getter to return " + firstName + " as firstName.");
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println(Utils.getDateFormattedLikeSpringBoot() + " - Student : in "+this+" setter to instantiate Student with " + firstName + " as firstName.");
        this.firstName = firstName;
    }

    public int getMasterPercentage() {
        return masterPercentage;
    }

    public void setMasterPercentage(int masterPercentage) {
        this.masterPercentage = masterPercentage;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
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
