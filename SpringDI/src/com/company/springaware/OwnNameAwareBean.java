package com.company.springaware;

import org.springframework.beans.factory.BeanNameAware;

public class OwnNameAwareBean implements BeanNameAware {
	private String beanName;

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanName() {
		return beanName;
	}
}
