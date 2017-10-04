package com.company.pnamespace;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.company.common.Person;

public class PNamespaceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		XmlBeanFactory beanFactory = 
			new XmlBeanFactory(
					new ClassPathResource("com/company/pnamespace/pnamespaceDemo-context.xml"));
	
		Person person = 
			(Person) beanFactory.getBean("mother");
	
		System.out.println("Initialized properties of the person mother:");
		System.out.println("First name: " + person.getFirstName());
		System.out.println("Last name: " + person.getLastName());
		System.out.println("Age: " + person.getAge());
		
		person = 
			(Person) beanFactory.getBean("son");
	
		System.out.println("Initialized properties of the person son:");
		System.out.println("First name: " + person.getFirstName());
		System.out.println("Last name: " + person.getLastName());
		System.out.println("Age: " + person.getAge());

	}

}
