package com.company.xmlfactorydemo;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.company.common.ServiceClient;

public class XmlFactoryDemo {
	public static void main(String[] args) {
		XmlBeanFactory beanFactory = 
			new XmlBeanFactory(
					new ClassPathResource("com/company/xmlfactorydemo/xmlFactoryDemo-context.xml"));
	
		ServiceClient client = 
			(ServiceClient) beanFactory.getBean("serviceClient");
	
		String str = "this is test string";
		System.out.println("Original string: " + str);
		System.out.println("Processed by service string: " + 
				client.callService("this is test string"));
	}
}
