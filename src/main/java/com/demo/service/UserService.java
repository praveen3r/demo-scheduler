package com.demo.service;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.User;
import com.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	
	public User getUser(final BigInteger id){
		User user = null;
		try {
			user = (userRepository.findById(id)).get();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return user;
	}
	
	
	
}
