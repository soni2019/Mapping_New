package com.hcl.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.user.domain.Items;
import com.hcl.user.repository.ItemsRepo;

@RestController
@RequestMapping("/user")
public class ItemController {
	
	@Autowired
	ItemsRepo itemsRepo;

	@PostMapping("/items")
	public ResponseEntity<Items> addItem(@RequestBody Items items)
	{
		Items itemsView = itemsRepo.save(items);
		return new ResponseEntity<Items>(itemsView,HttpStatus.CREATED);
		
	}

}
