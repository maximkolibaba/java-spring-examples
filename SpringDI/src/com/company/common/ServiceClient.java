package com.company.common;

public class ServiceClient { 
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
