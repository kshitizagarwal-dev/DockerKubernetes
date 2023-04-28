package com.nagarro.kshitizagarwal.Application2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
@RequestMapping("/docker")
public class controller {
	
	@GetMapping
	public String getMessage() {
		
		return "hii this is a docker assignment";
	}
	

}
