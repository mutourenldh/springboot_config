package com.haoge.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.haoge.bean.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02ApplicationTests {
	@Autowired
	Person person;
	@Autowired
	ApplicationContext ioc;
	
	@Test
	public void contextLoads() {
		System.out.println(person);
	}
	@Test
	public void context() {
		boolean containsBean = ioc.containsBean("helloService");
		System.out.println(containsBean);
	}
}
