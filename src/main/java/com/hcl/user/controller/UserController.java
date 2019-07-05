package com.hcl.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.user.domain.User;
import com.hcl.user.service.UserService;

@RestController
@RequestMapping
public class UserController {
	
	@Autowired
	UserService userService;
	@PostMapping("/user")
	public ResponseEntity<User> addUser(@RequestBody User user)
	{
        User add = userService.addUser(user);
        return new ResponseEntity<User>(add,HttpStatus.CREATED);
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUser()
	{
		List<User> getAll = userService.getAllUser();
		return new ResponseEntity<List<User>>(getAll,HttpStatus.OK);
	}

}
