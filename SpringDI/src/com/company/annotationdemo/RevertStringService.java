package com.company.annotationdemo;

import org.springframework.stereotype.Component;

@Component("stringProcessingService")
public class RevertStringService implements StringProcessingService {

	public String processString(String str) {
		StringBuilder builder = new StringBuilder();
		
		if (str != null) {
			for (int i=str.length() - 1; i >= 0; i --)
				builder.append(str.charAt(i));
		}
			
		return builder.toString();
	}
}
