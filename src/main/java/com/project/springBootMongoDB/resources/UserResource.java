package com.project.springBootMongoDB.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.springBootMongoDB.domain.User;
import com.project.springBootMongoDB.dto.UserDTO;
import com.project.springBootMongoDB.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<  List <UserDTO>  > findALL(){
		List <User> listUsers = userService.findAll();
		List <UserDTO> listUsersDTO =  listUsers.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listUsersDTO);
	}

}
