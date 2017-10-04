package com.company.annotationdemo.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.common.Person;

public class LifecycleDemo {
	public static void main(String[] args) {
		ApplicationContext beanFactory =
			new ClassPathXmlApplicationContext("com/company/annotationdemo/lifecycle/lifecycleDemo-context.xml");
	
		Person person = 
			(Person) beanFactory.getBean("person");
	
		System.out.println("Initialized person:");
		System.out.println("First name: " + person.getFirstName());
		System.out.println("Last name: " + person.getLastName());
		System.out.println("Age: " + person.getAge());		
	}
}
