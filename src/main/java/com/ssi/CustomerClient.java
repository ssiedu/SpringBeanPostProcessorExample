package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerClient {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		

	}

}
