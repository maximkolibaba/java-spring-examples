package com.company.lifecycle;

import org.springframework.beans.factory.InitializingBean;

import com.company.common.Person;

public class ExtendedPerson extends Person 
	implements InitializingBean{
	public void init() {
		System.out.println("Init callback method");
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("Method of the InitializingBean interface");
	}
}
