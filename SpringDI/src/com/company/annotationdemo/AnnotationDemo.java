package com.company.annotationdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {
	
	public static void main(String[] args) {
		ApplicationContext beanFactory =
			new ClassPathXmlApplicationContext("com/company/annotationdemo/annotationDemo-context.xml");
	
		ServiceCaller client = 
			(ServiceCaller) beanFactory.getBean("serviceCaller");
	
		String str = "this is test string";
		System.out.println("Original string: " + str);
		System.out.println("Processed by service string: " + 
				client.callService("this is test string"));
	}
}
