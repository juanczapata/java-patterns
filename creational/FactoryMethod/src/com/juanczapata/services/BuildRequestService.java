package com.juanczapata.services;

import com.juanczapata.processors.BuildRequestProcessor;

/**
 * Class that defines the Factory Method
 * @author juancarlos
 *
 */

public abstract class BuildRequestService {
	public abstract BuildRequestProcessor createProcessor();
}
