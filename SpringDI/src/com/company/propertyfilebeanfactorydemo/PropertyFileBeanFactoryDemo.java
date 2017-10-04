package com.company.propertyfilebeanfactorydemo;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.company.common.ServiceClient;

public class PropertyFileBeanFactoryDemo {
	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = 
				new DefaultListableBeanFactory();
		BeanDefinitionReader propertyReader = 
				new PropertiesBeanDefinitionReader(beanFactory);
		
		propertyReader.loadBeanDefinitions(
				new ClassPathResource("com/company/propertyfilebeanfactorydemo/propertyFile-context.properties"));
		
		ServiceClient client = 
				(ServiceClient) beanFactory.getBean("serviceClient");
		
		String str = "this is test string";
		System.out.println("Original string: " + str);
		System.out.println("Processed by service string: " + 
				client.callService("this is test string"));
	}
}
