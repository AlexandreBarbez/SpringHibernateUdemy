package com.halx.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.halx.spring.coach", "com.halx.spring.fortune"})
@PropertySource("classpath:teamNamesForSpringPart.properties")
public class SportConfig {
}
