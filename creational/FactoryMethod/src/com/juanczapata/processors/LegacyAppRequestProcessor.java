package com.juanczapata.processors;

public class LegacyAppRequestProcessor implements BuildRequestProcessor {

	@Override
	public void processRequest() {
		System.out.println("Legacy App request processed.");
	}

}
