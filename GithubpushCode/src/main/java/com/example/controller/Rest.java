package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {

	@GetMapping("train")
	public String getTrain()
	{
		return "getting trainsss...";
	}
	@PostMapping
	public String save()
	{
		return "save";
	}
}
