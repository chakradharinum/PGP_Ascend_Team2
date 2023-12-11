package com.product.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


import com.product.mongo.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	
    
    @Query("{email:'?0'}")
    User checkUserInfo(String uemail);


}
