package com.company.springaware;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SpringAwareDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		XmlBeanFactory beanFactory = 
			new XmlBeanFactory(
					new ClassPathResource("com/company/springaware/springAwareDemo-context.xml"));

		SpringAwareBean springAwareBean = (SpringAwareBean) beanFactory.getBean("springAwareBean");
	
		if (springAwareBean.getBeanFactory() != null)
			System.out.println("SpringAwareBean is initiated");
		else
			System.out.println("SpringAwareBean is not initiated");

		OwnNameAwareBean nameAwareBean = (OwnNameAwareBean) springAwareBean.getBean("nameAwareBean");
		
		System.out.println("From the instance of SpringAwareBean is gotten a bean of the type OwnNameAwareBean with the name: " + nameAwareBean.getBeanName());
	}

}
