package com.tech4bros.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tech4bros.models.Account;

@RestController
public class FormController {

	
	@PostMapping(path = "/api/submit")
	public ResponseEntity<Object> submitMethod(@RequestBody Account account){
		// do database operations using account object
		// for testing I'll print only the values		
		return new ResponseEntity<Object> (	account.getMap(), HttpStatus.OK );
	}
	
}
