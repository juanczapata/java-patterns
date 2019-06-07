package com.juanczapata.main;

import com.juanczapata.services.BuildRequestService;
import com.juanczapata.services.LegacyRequestService;
import com.juanczapata.services.NativeRequestService;

public class FactoryMethodMain {

	public static void main(String[] args) {
		
		BuildRequestService requestService = getRequestProcessor("native");
		requestService.createProcessor().processRequest();
		
	}
	
	public static BuildRequestService getRequestProcessor(String requestType) {
		if("native".equalsIgnoreCase(requestType)) {
			return new NativeRequestService();
		}
		return new LegacyRequestService();
	}
}
