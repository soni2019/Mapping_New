package com.hcl.user.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.user.domain.Items;
import com.hcl.user.domain.User;
import com.hcl.user.domain.UserCart;
import com.hcl.user.repository.UserRepository;
import com.hcl.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepo;
	
	@Override
	public User addUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}

	

}
