package com.croma.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.croma.user.model.User;
import com.croma.user.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService service;
	
	@GetMapping("/user")
	public List<User> get()
	{ 
	 return service.getUsers(); 
	}
	
	@PostMapping("/user")
	public String post(@RequestBody User user)
	{  
		 service.postUser(user); 
		 return "USER SAVED SUCCESSFULLY";
	}
	
	@DeleteMapping("/user")
	public String delete()
	{
		service.deleteAll();
		return "DELETED";
	}
	
	
	

}
