package com.hcl.user.serviceImpl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.user.domain.Items;
import com.hcl.user.domain.UserCart;
import com.hcl.user.repository.ItemsRepo;
import com.hcl.user.repository.UserCartRepo;
import com.hcl.user.service.UserCartService;

@Service
public class UserCartImpl implements UserCartService {

	@Autowired
	UserCartRepo userCardRepo;
	@Autowired
	ItemsRepo itemsRepo;
	
	@Override
	public Set<Items> addItem(Items items) {
		itemsRepo.save(items);
		return null;
	}

	@Override
	public UserCart cartItems() {
		UserCart userCard= userCardRepo.findAll();
		return userCard;
	}
}
