package com.hcl.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.user.domain.UserProfile;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Integer> {

}
