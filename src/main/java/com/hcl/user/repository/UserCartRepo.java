package com.hcl.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.user.domain.UserCart;

@Repository
public interface UserCartRepo extends JpaRepository<UserCart, Double>{

}
