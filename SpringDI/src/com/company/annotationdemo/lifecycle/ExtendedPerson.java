package com.company.annotationdemo.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.company.common.Person;

public class ExtendedPerson extends Person {
	@PostConstruct
	public void init() {
		System.out.println("@PostConstruct method");
	}	
	@PreDestroy
	public void destroy() {
		System.out.println("@PreDestroy method");
	}
}
