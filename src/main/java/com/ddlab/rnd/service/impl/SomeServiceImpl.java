package com.ddlab.rnd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.clients.ServiceClient;
import com.ddlab.rnd.service.SomeService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@Service
public class SomeServiceImpl implements SomeService {

	@Autowired
	private ServiceClient client;

	@CircuitBreaker(name = "demoName", fallbackMethod = "getAlternateInfo")
	@Override
	public String getData() {
		return client.getDataInfo();
	}

	public String getAlternateInfo(Throwable t) {
		return "Currently service is not available, try after sometime";
	}
}
