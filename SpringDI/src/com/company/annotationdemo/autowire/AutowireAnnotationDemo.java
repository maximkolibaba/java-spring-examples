package com.company.annotationdemo.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.annotationdemo.common.Child;

public class AutowireAnnotationDemo {
	public static void main(String[] args) {
		ApplicationContext beanFactory =
			new ClassPathXmlApplicationContext("com/company/annotationdemo/autowire/autowireAnnotationDemo-context.xml");
	
		Child person = 
			(Child) beanFactory.getBean("child");
	
		System.out.println("Initialized person:");
		System.out.println("First name: " + person.getFirstName());
		System.out.println("Last name: " + person.getLastName());
		System.out.println("Age: " + person.getAge());
		System.out.println("Mother: " + person.getMother());
		System.out.println("Father: " + person.getFather());
	}
}
