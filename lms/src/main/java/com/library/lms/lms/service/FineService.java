package com.library.lms.lms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.lms.lms.entity.Fine;
import com.library.lms.lms.repository.FineRepository;

@Service
public class FineService {
	private final FineRepository fineRepository;
	
	public FineService(FineRepository fineRepository) {
		this.fineRepository = fineRepository;
	}
	
	public List<Fine> getFines() {
		return fineRepository.findAll();
	}
}
