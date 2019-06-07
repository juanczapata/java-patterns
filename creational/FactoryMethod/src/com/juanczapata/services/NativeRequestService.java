package com.juanczapata.services;

import com.juanczapata.processors.BuildRequestProcessor;
import com.juanczapata.processors.NativeAppRequestProcessor;

public class NativeRequestService extends BuildRequestService {

	@Override
	public BuildRequestProcessor createProcessor() {
		return new NativeAppRequestProcessor();
	}

}
