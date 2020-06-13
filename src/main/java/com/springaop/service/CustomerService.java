package com.springaop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springaop.Repository.CustomerRepo;
import com.springaop.entity.Customer;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepo customerRepo;

	/**
	 * This method add customer to DB
	 * @param p_customer
	 */
	public String addCustomer(Customer p_customer) {
		
		try {
			
			customerRepo.save(p_customer);
			
			return "Customer "+p_customer.getName()+" added";
	
		} catch(Exception l_e) {
			return l_e.getLocalizedMessage();
		}
		
	}
	//-------------------------------------------------------------------------
}
