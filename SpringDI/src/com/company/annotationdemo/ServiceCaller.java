package com.company.annotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class ServiceCaller {
	
	@Autowired
	private StringProcessingService stringProcessingService;
	
	public String callService(String str) {
		return stringProcessingService.processString(str);
	}

	/**
	 * @param service the service to set
	 */
	public void setStringProcessingService(StringProcessingService service) {
		this.stringProcessingService = service;
	}
}
