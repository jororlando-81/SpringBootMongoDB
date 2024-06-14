package com.project.springBootMongoDB.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.springBootMongoDB.domain.User;
import com.project.springBootMongoDB.dto.UserDTO;
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
	
	public User insert ( User user ) {
		
		return userRepository.insert(user) ;
		
	}
	
	
	public void delete ( String id ) {
		findById ( id );
		userRepository.deleteById(id);
		
	}
	
	public User update ( User user ) {
		
		Optional<User> newUser = userRepository.findById(user.getId());
		updateData ( newUser.get() , user );
		return userRepository.save(newUser.get()) ;
		
	}
	
	public void updateData ( User newUser , User user ) {
		
		newUser.setName(user.getName());
		newUser.setEmail(user.getEmail());
		
	}
	
	
	
	
	public User fromDTO ( UserDTO userDTO ) {
		
		return new User( userDTO.getId() , userDTO.getName() , userDTO.getEmail() ) ;
		
	}
	
}
 