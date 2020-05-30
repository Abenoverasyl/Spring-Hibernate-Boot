package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
//		load the Spring configuration file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		

//		retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
//		check if they are the same
		boolean result = (theCoach == alphaCoach);
		
//		print out the result
		System.out.println("\nPrinting the Same object: " + result);
		
		System.out.println("\nMemory loaction for theCoach: " + theCoach);
		
		System.out.println("\nMemory loaction for theCoach: " + alphaCoach + "\n");
		
//		close the context
		context.close();
	}

}
