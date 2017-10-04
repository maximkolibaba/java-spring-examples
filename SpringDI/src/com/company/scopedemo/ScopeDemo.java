package com.company.scopedemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.common.Person;



public class ScopeDemo {
	public static void main(String[] args) {
		ApplicationContext beanFactory =
			new ClassPathXmlApplicationContext("com/company/scopedemo/scopeDemo-context.xml");
	
		Person person1 = 
			(Person) beanFactory.getBean("singletonPerson");
		
		Person person2 = 
			(Person) beanFactory.getBean("singletonPerson");
		
		boolean isEqual = person1==person2;
		System.out.println("Two objects of the same singleton bean are equal: " + isEqual);

		person1 = 
			(Person) beanFactory.getBean("prototypePerson");
		
		person2 = 
			(Person) beanFactory.getBean("prototypePerson");
		
		isEqual = person1==person2;
		System.out.println("Two objects of the same singleton bean are equal: " + isEqual);
	}
}
