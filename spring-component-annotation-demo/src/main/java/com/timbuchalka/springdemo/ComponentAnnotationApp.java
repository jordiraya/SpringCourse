package com.timbuchalka.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.timbuchalka.springdemo.domain.promotion.TradeFair;

public class ComponentAnnotationApp {

	public static void main(String[] args) {
		// create the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		TradeFair tradefair = (TradeFair)ctx.getBean("myfair");
		System.out.println(tradefair.specialPromotionalPricing());
		
		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();		
	}

}
