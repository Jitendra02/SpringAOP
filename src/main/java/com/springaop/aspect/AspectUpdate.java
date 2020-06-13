package com.springaop.aspect;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.springaop.entity.Customer;

@Aspect
@Component
public class AspectUpdate {

	/**
	 * This pointcut expression will execute before entering addCustomer 
	 * method
	 * @param joinPoint
	 */
	@Before(value = "execution(* com.springaop.service.CustomerService.addCustomer(..))")
	public void updateCustomer(JoinPoint joinPoint) {
		
		Object obj = joinPoint.getArgs()[0];
		
		if(obj instanceof Customer) {
			((Customer) obj).setAdmissionDate(new Date());
		}
	}
	//-------------------------------------------------------------------------
}
