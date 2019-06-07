package com.juanczapata.processors;

public class NativeAppRequestProcessor implements BuildRequestProcessor {

	@Override
	public void processRequest() {
		System.out.println("Native App request processed.");
	}

}
