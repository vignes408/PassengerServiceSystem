package com.vickee.restapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vickee.restapp.model.Register;
import com.vickee.restapp.service.RegisterService;

@RestController
@RequestMapping("/addregister")
@CrossOrigin("*")

public class RegisterController {

	@Autowired
	RegisterService service;
	
	@PostMapping
	public void addRegister(@RequestBody Register register) {
		service.addRegister(register);
	}
}
