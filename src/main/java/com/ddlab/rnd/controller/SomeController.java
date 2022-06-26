package com.ddlab.rnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ddlab.rnd.service.SomeService;

@RequestMapping("/external")
@RestController
public class SomeController {
	
	@Autowired
	private SomeService service;
	
	@ResponseBody
	@GetMapping("/info")
	public String getExternalInfo() {
		return service.getData();
	}

}
