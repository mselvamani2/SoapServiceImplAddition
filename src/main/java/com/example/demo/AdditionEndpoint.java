package com.example.demo;

import org.example.additionrequest.AdditionRequest;
import org.example.additionrequest.AdditionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class AdditionEndpoint {
	
	private static final String NAMESPACE="http://www.example.org/AdditionRequest";
	
	@Autowired
	private AdditionService service;
	
	@PayloadRoot(namespace = NAMESPACE,localPart = "AdditionRequest")
	@ResponsePayload
	public AdditionResponse getAdditionResult(@RequestPayload AdditionRequest request)
	{
		return service.getAddition(request);
	}
	

}
