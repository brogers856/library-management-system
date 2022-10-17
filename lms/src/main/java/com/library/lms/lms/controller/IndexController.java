package com.library.lms.lms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.lms.lms.service.IndexService;

@RestController
@RequestMapping(path = "api/v1/index")
public class IndexController {
	private final IndexService indexService;
	
	public IndexController(IndexService indexService) {
		this.indexService = indexService;
	}
	
	@GetMapping
	public String index() {
		return this.indexService.index();
	}
}
