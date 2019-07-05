package com.hcl.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.user.domain.Items;

public interface ItemsRepo extends JpaRepository<Items, String>{

}
