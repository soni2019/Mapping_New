package com.hcl.user.service;

import java.util.List;

import com.hcl.user.domain.UserProfile;

public interface UserProfileService {
	
	public UserProfile addUserProfile(UserProfile user);
	
	public List<UserProfile> getAll();
	

}
