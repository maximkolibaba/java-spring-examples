package com.company.lifecycle;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.company.common.Person;

public class LifecycleDemo {
	public static void main(String[] args) {
		XmlBeanFactory beanFactory = 
			new XmlBeanFactory(
					new ClassPathResource("com/company/lifecycle/lifecycleDemo-context.xml"));
	
		Person person = 
			(Person) beanFactory.getBean("person");
	
		System.out.println("Initialized person:");
		System.out.println("First name: " + person.getFirstName());
		System.out.println("Last name: " + person.getLastName());
		System.out.println("Age: " + person.getAge());		
	}
}
