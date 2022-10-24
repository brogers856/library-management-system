package com.library.lms.lms.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.lms.lms.entity.Fine;
import com.library.lms.lms.service.FineService;

@RestController
@RequestMapping(path = "/api/v1/fine")
public class FineController {
	private FineService fineService;
	
	public FineController(FineService fineService) {
		this.fineService = fineService;
	}
	
	@GetMapping()
	public List<Fine> getFines(){
		return fineService.getFines();
	}

}
