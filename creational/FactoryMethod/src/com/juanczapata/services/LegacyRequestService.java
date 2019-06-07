package com.juanczapata.services;

import com.juanczapata.processors.BuildRequestProcessor;
import com.juanczapata.processors.LegacyAppRequestProcessor;

public class LegacyRequestService extends BuildRequestService {

	@Override
	public BuildRequestProcessor createProcessor() {
		return new LegacyAppRequestProcessor();
	}

}
