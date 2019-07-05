package com.hcl.user.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String firstName;
	//private String lastName;
	
	@OneToOne(mappedBy ="user" )
	private UserProfile userProfile;
	
	public User() {
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public UserProfile getUserProfile() {
		return userProfile;
	}
	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/*
	 * public String getLastName() { return lastName; } public void
	 * setLastName(String lastName) { this.lastName = lastName; }
	 * 
	 * @Override public String toString() { return "User [id=" + id + ", firstName="
	 * + firstName + ", lastName=" + lastName + "]"; }
	 */
	
	

}
