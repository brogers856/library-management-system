package com.library.lms.lms.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.lms.lms.entity.Loan;
import com.library.lms.lms.service.LoanService;

@RestController
@RequestMapping(path = "/api/v1/loan")
public class LoanController {

	private final LoanService loanService;
	
	public LoanController(LoanService loanService) {
		this.loanService = loanService;
	}
	
	@GetMapping
	public List<Loan> getLoans() {
		return loanService.getLoans();
	}
	
}
