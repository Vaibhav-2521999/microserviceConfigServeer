package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Train;
import com.example.demo.service.TrainService;

@RestController
@RequestMapping("/cache")
public class TrainController 
{
	@Autowired
	TrainService service;
	
	@PostMapping("/save")
public ResponseEntity<Train> saveTrain(@RequestBody Train train)
{
	service.saveTrain(train);
	
	return new ResponseEntity<Train>(train,HttpStatus.CREATED);
}

	@GetMapping("/{id}")
public ResponseEntity<Train> getTrain(@PathVariable int id)
{
	Train train = service.getTrain(id);
	return new ResponseEntity<Train>(train,HttpStatus.OK);
	
}

}
