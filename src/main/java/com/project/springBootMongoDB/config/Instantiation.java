package com.project.springBootMongoDB.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.project.springBootMongoDB.domain.Post;
import com.project.springBootMongoDB.domain.User;
import com.project.springBootMongoDB.dto.AuthorDTO;
import com.project.springBootMongoDB.dto.CommentDTO;
import com.project.springBootMongoDB.repository.PostRepository;
import com.project.springBootMongoDB.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT") );
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		User marcos = new User(null, "Marcos Grossi", "MarcosGrossi@gamil.com");
		User betina = new User(null, "Betiama Gurchi", "BetianGurchi@gmail.com");
		User braian = new User(null, "Braian Gress", "braian@gmail.com");
		
		userRepository.saveAll( Arrays.asList( marcos, betina , braian )  );
		
		Post post1 = new Post(null, sdf.parse("10/06/2024"), "Gym", "I´m going", new AuthorDTO(marcos) ) ;
		Post post2 = new Post(null, sdf.parse("11/06/2024"), "Good night", "I'm going to bed", new AuthorDTO(marcos) ) ;
		
		CommentDTO comment1 = new CommentDTO( "Me too" , sdf.parse("10/06/2024"), new AuthorDTO(betina) ) ;
		CommentDTO comment2 = new CommentDTO( "I'll be a few minutes late" , sdf.parse("10/06/2024"), new AuthorDTO(braian) ) ;
		CommentDTO comment3 = new CommentDTO( "Sleep tight, see you in the morning!" , sdf.parse("11/06/2024"), new AuthorDTO(betina) ) ;
		
		post1.getComments().addAll( Arrays.asList( comment1  , comment2 ));	
		post2.getComments().addAll( Arrays.asList( comment3 ) )  ;
		
		
		postRepository.saveAll(Arrays.asList(post1, post2) );
		
		marcos.getPosts().addAll(Arrays.asList(post1, post2)) ;
		userRepository.save(marcos);
	}

}
