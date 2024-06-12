package com.project.springBootMongoDB.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.springBootMongoDB.domain.User;
import com.project.springBootMongoDB.repository.UserRepository;
import com.project.springBootMongoDB.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public List<User> findAll () {
		
		return userRepository.findAll();
		
	}
	

	public User findById ( String id ) {
	
		return userRepository.findById(id).orElseThrow(
				() -> new ObjectNotFoundException("Id not found")  ) ;
		
	}
}
 