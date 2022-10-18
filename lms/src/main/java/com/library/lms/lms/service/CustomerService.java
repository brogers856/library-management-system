package com.library.lms.lms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.lms.lms.entity.Customer;
import com.library.lms.lms.repository.CustomerRepository;

@Service
public class CustomerService {
	
	private final CustomerRepository customerRepository;
	
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}
}
