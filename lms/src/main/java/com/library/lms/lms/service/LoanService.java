package com.library.lms.lms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.lms.lms.entity.Loan;
import com.library.lms.lms.repository.LoanRepository;

@Service
public class LoanService {

	private final LoanRepository loanRepository;
	
	public LoanService(LoanRepository loanRepository) {
		this.loanRepository = loanRepository;
	}
	
	public List<Loan> getLoans() {
		return loanRepository.findAll();
	}
}
