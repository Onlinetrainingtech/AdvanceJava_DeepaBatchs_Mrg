package com.xyz.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		
		
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Coach t1=(Coach) context.getBean("my1",Coach.class);
	
	
	Coach t2=(Coach) context.getBean("my2",Coach.class);
	

	System.out.println(t1.getPlay());
	
	System.out.println(t2.getPlay());
	
	context.close();
	}

}
