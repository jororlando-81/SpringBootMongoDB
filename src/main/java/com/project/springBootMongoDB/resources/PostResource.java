package com.project.springBootMongoDB.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.project.springBootMongoDB.domain.Post;
import com.project.springBootMongoDB.resources.util.URL;
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
	
	@GetMapping(value = "/titlesearch")
	public ResponseEntity<List<Post>> findByTitle( @RequestParam (value = "text", defaultValue = "" ) String text )  {
		text = URL.decodeParameter(text);
		List<Post> listPost = postService.findByTitle(text);
		return ResponseEntity.ok().body( listPost );
	}
}
