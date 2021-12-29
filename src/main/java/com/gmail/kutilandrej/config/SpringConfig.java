package com.gmail.kutilandrej.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.gmail.kutilandrej")
@PropertySource("classpath:application.properties")
public class SpringConfig {}
