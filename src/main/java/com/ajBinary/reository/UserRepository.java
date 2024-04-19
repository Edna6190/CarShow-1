package com.ajBinary.reository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajBinary.entity.User;

public interface UserRepository extends JpaRepository <User,Long >{
	Optional<User>findByUsername(String username);

}
