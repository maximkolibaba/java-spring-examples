package com.company.autowire;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.company.common.Person;

public class AutowireDemo {
	public static void main(String[] args) {
		XmlBeanFactory beanFactory = 
			new XmlBeanFactory(
					new ClassPathResource("com/company/autowire/autowireDemo-context.xml"));
	
		Person person = 
			(Person) beanFactory.getBean("son");
	
		System.out.println("Initialized person:");
		System.out.println("First name: " + person.getFirstName());
		System.out.println("Last name: " + person.getLastName());
		System.out.println("Age: " + person.getAge());
		System.out.println("Mother: " + person.getMother());
		System.out.println("Father: " + person.getFather());
	}
}
