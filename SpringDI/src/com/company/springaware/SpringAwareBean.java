package com.company.springaware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class SpringAwareBean implements BeanFactoryAware {
	BeanFactory beanFactory;

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}
	
	public BeanFactory getBeanFactory() {
		return beanFactory;
	}
	
	public Object getBean(String beanName) {
		return beanFactory.getBean(beanName);
	}
}
