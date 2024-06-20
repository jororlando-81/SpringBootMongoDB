package com.project.springBootMongoDB.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.springBootMongoDB.domain.Post;
import com.project.springBootMongoDB.repository.PostRepository;
import com.project.springBootMongoDB.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;

	
	public Post findById ( String id ) {
	
		return postRepository.findById(id).orElseThrow(
				() -> new ObjectNotFoundException("Id not found")  ) ;
		
	}
	
	public List<Post> findByTitle ( String text ) {
		
		return postRepository.findByTitleContainingIgnoreCase(text);
		
	}
	
}
 