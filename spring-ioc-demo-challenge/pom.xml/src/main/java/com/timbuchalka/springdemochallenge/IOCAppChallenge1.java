package com.timbuchalka.springdemochallenge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCAppChallenge1 {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/beans-challenge.xml");
		
		City city = (City)ctx.getBean("myCity");
		
		System.out.println("test IOCAppChallenge1");
		city.cityName();
		
		((FileSystemXmlApplicationContext)ctx).close();
	}

}
