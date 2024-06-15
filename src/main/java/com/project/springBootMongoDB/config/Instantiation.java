package com.project.springBootMongoDB.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.project.springBootMongoDB.domain.Post;
import com.project.springBootMongoDB.domain.User;
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
		
		Post post1 = new Post(null, sdf.parse("10/06/2024"), "Gym", "I´m going", marcos) ;
		Post post2 = new Post(null, sdf.parse("11/06/2024"), "Good night", "I'm going to bed", marcos) ;
		
		userRepository.saveAll( Arrays.asList( marcos, betina , braian )  );
		postRepository.saveAll(Arrays.asList(post1, post2) );
	}

}
