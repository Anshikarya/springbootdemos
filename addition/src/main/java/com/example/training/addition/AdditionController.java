package com.example.training.addition;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class AdditionController {
	public ResponseEntity<Addition> processAddition(Addition requestJSON) {
		//Building Response JSON
		Addition responseJSON = new Addition();
		responseJSON.setA(requestJSON.getA());
		responseJSON.setB(requestJSON.getB());
		responseJSON.process(); //Update the result
		
		//Returning Response JSON + HTTP Status code 200 i.e. OK
		ResponseEntity response = new ResponseEntity(responseJSON, HttpStatus.OK);
		return response;
	}
}

