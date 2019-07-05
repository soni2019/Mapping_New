package com.hcl.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.user.domain.UserCart;
import com.hcl.user.repository.UserCartRepo;

@RestController
@RequestMapping("/user")
public class CartController {
	@Autowired
	UserCartRepo userCartRepo;

	@GetMapping("/cart")
	public ResponseEntity<List<UserCart>> cartItems()
	{
		List<UserCart> userCart = userCartRepo.findAll();
		return new ResponseEntity<List<UserCart>>(userCart,HttpStatus.OK);
		
	}
}
