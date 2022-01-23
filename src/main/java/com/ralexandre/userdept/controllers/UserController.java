package com.ralexandre.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ralexandre.userdept.entities.User;
import com.ralexandre.userdept.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		
		List<User> result = repository.findAll();
		
		return result;
		
	}

}
