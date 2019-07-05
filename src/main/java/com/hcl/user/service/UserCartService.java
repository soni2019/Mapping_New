package com.hcl.user.service;

import java.util.Set;

import com.hcl.user.domain.Items;
import com.hcl.user.domain.UserCart;

public interface UserCartService {

public Set<Items> addItem(Items items);
	
public UserCart cartItems();

}
