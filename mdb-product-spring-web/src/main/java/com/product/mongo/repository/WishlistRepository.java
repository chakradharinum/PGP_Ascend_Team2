package com.product.mongo.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.product.mongo.model.Cart;
import com.product.mongo.model.Category;
import com.product.mongo.model.User;
import com.product.mongo.model.Wishlist;

public interface WishlistRepository extends MongoRepository<Wishlist, BigInteger> {

	@Query("{}")
	List<Wishlist> getAllItemsInWishlist();
	
	/*
	 * @Query("{}") Wishlist addItemToWishlist(BigInteger itemId);
	 * 
	 * @Query("{}") Wishlist deleteItemFromWishlist(BigInteger itemId);
	 */

}