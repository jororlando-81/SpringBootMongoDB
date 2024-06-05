package com.project.springBootMongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.springBootMongoDB.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User , String>   {

}
