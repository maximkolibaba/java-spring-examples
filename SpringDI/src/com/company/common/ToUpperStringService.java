package com.company.common;

public class ToUpperStringService implements StringProcessingService {

	@Override
	public String processString(String str) {
		if (str != null)
			return str.toUpperCase();
		else
			return null;
	}

}
