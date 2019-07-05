package com.hcl.user.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.user.domain.User;
import com.hcl.user.domain.UserProfile;
import com.hcl.user.repository.UserProfileRepository;
import com.hcl.user.repository.UserRepository;
import com.hcl.user.service.UserProfileService;

@Service
public class UserProfileServiceImpl implements UserProfileService{

	@Autowired
	UserProfileRepository userProfileRepo;
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserProfile addUserProfile(UserProfile userProfile) {
		
	//	userProfile.getUser().getUserId();
		
		Optional<User> user=userRepository.findById(userProfile.getUser().getUserId());
		if(user.isPresent())
		{
			userProfileRepo.save(userProfile);
		}
		else
		{
			System.out.println("User not found");
		}
		
		//User
		
		return null;
	}

	@Override
	public List<UserProfile> getAll() {
		return userProfileRepo.findAll();
	}

}
