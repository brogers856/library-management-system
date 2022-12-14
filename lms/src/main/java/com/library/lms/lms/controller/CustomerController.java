package com.library.lms.lms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.lms.lms.entity.Customer;
import com.library.lms.lms.service.CustomerService;

@RestController
@RequestMapping(path = "/api/v1/customer")
public class CustomerController {
	private CustomerService customerService;
	
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping()
	public List<Customer> getCustomers(){
		return customerService.getCustomers();
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Customer> getCustomerById(@PathVariable("id") int customerId) {
		return customerService.getCustomerById(customerId);
	}
	
	@PostMapping
	public void addBook(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}
}
