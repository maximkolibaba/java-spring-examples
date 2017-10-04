package com.company.factorymethoddemo;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.company.common.Person;

public class FactoryMethodInitDemo {
	public static void main(String[] args) {
		XmlBeanFactory beanFactory = 
			new XmlBeanFactory(
					new ClassPathResource("com/company/factorymethoddemo/factoryMethodInitDemo-context.xml"));
	
		Person person = 
			(Person) beanFactory.getBean("person1");
	
		System.out.println("Initialized person 1:");
		System.out.println("First name: " + person.getFirstName());
		System.out.println("Last name: " + person.getLastName());
		System.out.println("Age: " + person.getAge());
		
		person = 
			(Person) beanFactory.getBean("person2");
	
		System.out.println("Initialized person 2:");
		System.out.println("First name: " + person.getFirstName());
		System.out.println("Last name: " + person.getLastName());
		System.out.println("Age: " + person.getAge());

	}
}
