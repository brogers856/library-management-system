package com.library.lms.lms.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.library.lms.lms.entity.Copy;
import com.library.lms.lms.service.CopyService;

@RestController
@RequestMapping(path = "/api/v1/copy")
public class CopyController {
	
	private final CopyService copyService;
	
	public CopyController(CopyService copyService) {
		this.copyService = copyService;
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Copy> getCopyById(@PathVariable("id") int copyId) {
		return copyService.getCopyById(copyId);
	}
	
	@PostMapping
	public void addCopy(@RequestBody ObjectNode json) {
		ObjectMapper mapper = new ObjectMapper();
		int bookId = json.get("bookId").asInt();
		Copy copy = mapper.convertValue(json.get("copy"), Copy.class);
		copyService.addCopy(copy, bookId);
	}
	

}
