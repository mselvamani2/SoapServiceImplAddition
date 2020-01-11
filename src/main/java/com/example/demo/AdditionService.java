package com.example.demo;

import org.example.additionrequest.AdditionRequest;
import org.example.additionrequest.AdditionResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AdditionService {

	public AdditionResponse getAddition(@RequestBody AdditionRequest request)
	{
		AdditionResponse res=new AdditionResponse();
		res.setAdditionResult(request.getNum1()+request.getNum2());
		return res;
	}
}
