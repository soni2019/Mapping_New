package com.hcl.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.user.domain.UserProfile;
import com.hcl.user.service.UserProfileService;

@RestController
@RequestMapping
public class UserProfileController {
	
	@Autowired
	UserProfileService userProfile;
	
	@PostMapping("/add")
	public ResponseEntity<UserProfile> addUserProfile(@RequestBody UserProfile user)
	{
		UserProfile add = userProfile.addUserProfile(user);
		return new ResponseEntity<UserProfile>(add,HttpStatus.CREATED);
	}

}
