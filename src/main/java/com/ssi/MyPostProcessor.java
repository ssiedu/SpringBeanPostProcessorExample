package com.ssi;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		
		System.out.println("After-Initialization "+beanName);
		System.out.println(bean);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		
		System.out.println("Before-Initialization "+beanName);
		return bean;
	}

	
	
	
}
