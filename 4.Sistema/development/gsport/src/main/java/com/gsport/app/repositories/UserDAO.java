package com.gsport.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gsport.app.models.User;

@Repository
public interface UserDAO extends JpaRepository<User, Long>{
	User findByEmail(String email);
}
