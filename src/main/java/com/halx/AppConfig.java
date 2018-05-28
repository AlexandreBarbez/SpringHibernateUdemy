package com.halx;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.halx.spring","com.halx.springmvc"})
@PropertySource("classpath:teamNamesForSpringPart.properties")
public class AppConfig {

}
