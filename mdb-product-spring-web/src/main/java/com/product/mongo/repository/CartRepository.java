package com.product.mongo.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.product.mongo.model.Cart;

public interface CartRepository extends MongoRepository<Cart, BigInteger> {

	@Query("{}")
	List<Cart> getAllItemsInCart();
	
	/*
	 * @Query("{}") Wishlist addItemToCart(BigInteger itemId);
	 * 
	 * @Query("{}") Wishlist addQuantityForItemInCart(BigInteger itemId);
	 * 
	 * @Query("{}") Wishlist reduceQuantityForItemInCart(BigInteger itemId);
	 * 
	 * @Query("{}") Wishlist deleteItemFromCart(BigInteger itemId);
	 */
	
	@Query("{itemId:'?0'}")
	Cart getItemInCart(BigInteger itemId);

}