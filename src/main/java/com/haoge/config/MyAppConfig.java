package com.haoge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.haoge.service.HelloService;

@Configuration
public class MyAppConfig {
	@Bean 
	public HelloService helloService() {
		return new HelloService();
	}
}
