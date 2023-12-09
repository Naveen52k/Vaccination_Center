package com.vaccination.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaccination.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);

}
