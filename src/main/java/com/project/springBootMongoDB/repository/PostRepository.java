package com.project.springBootMongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.springBootMongoDB.domain.Post;


@Repository
public interface PostRepository extends MongoRepository<Post , String>   {

}
