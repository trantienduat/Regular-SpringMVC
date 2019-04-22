package com.tienduat.spring.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configurable
@EnableWebMvc
@ComponentScan(basePackages = {"com.tienduat.spring.controller"})
public class WebConfig extends WebMvcConfigurerAdapter{
	
}
