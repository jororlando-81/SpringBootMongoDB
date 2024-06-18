package com.project.springBootMongoDB.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.springBootMongoDB.domain.Post;
import com.project.springBootMongoDB.services.PostService;


@RestController
@RequestMapping(value = "/posts")
public class PostResource {

	@Autowired
	private PostService postService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Post> findById( @PathVariable String id){
		Post post = postService.findById(id); 
		return ResponseEntity.ok().body( post );
	}
	
	
}
