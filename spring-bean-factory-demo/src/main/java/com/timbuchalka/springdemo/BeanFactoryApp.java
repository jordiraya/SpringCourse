package com.timbuchalka.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryApp {

	public static void main(String[] args) {
		// create the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// create the bean
		Organization org = (Organization)ctx.getBean("myorg");
		Organization org2 = (Organization)ctx.getBean("myorg2");
		
		// invoke the company slogan via the bean
		//org.corporateSlogan();
		
		// print organization details
		System.out.println(org);
		System.out.println(org2);
		
		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();		
	}

}
