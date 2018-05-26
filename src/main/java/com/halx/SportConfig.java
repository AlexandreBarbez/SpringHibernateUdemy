package com.halx;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.halx.coach", "com.halx.fortune"})
@PropertySource("classpath:teamNames.properties")
public class SportConfig {
}
