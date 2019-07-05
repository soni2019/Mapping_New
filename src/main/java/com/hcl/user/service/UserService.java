package com.hcl.user.service;

import java.util.List;

import com.hcl.user.domain.Items;
import com.hcl.user.domain.User;
import com.hcl.user.domain.UserCart;

public interface UserService {
	
	public User addUser(User user);
	
	public List<User> getAllUser();
	
	
}
