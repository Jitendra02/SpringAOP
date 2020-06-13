package com.springaop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springaop.entity.Customer;
import com.springaop.service.CustomerService;

@RestController
@RequestMapping("/Customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping(value="/addEditCustomer")
	public ResponseEntity<Object> addEmployee(@RequestBody Customer customer){
		
		String response = customerService.addCustomer(customer);
		
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	
}
