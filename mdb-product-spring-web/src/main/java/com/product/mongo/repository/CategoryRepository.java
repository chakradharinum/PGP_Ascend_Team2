package com.product.mongo.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.product.mongo.model.Category;
import com.product.mongo.model.User;

public interface CategoryRepository extends MongoRepository<Category, BigInteger> {

	@Query("{}")
	List<Category> getAllCategories();

}