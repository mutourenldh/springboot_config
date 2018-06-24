package com.haoge.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	//SpringBoot选用 SLF4j和logback
	Logger logger = LoggerFactory.getLogger(getClass());
	@RequestMapping(value="/hello")
	public String hello(){
		logger.info("这是info日志。。。。。。。。。。。。。");
		return "Hello World";
	}
}
