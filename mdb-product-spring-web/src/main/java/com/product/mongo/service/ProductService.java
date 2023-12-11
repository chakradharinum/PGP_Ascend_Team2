package com.product.mongo.service;

import java.util.List;

import com.product.mongo.model.Cart;
import com.product.mongo.model.Category;
import com.product.mongo.model.Product;
import com.product.mongo.model.User;
import com.product.mongo.model.Wishlist;

public interface ProductService {

	public Product getProductByName(String pname);

	public List<Product> getAllProductByCategory(String pcategory);

	public User getUserByEmail(String uemail);

	public List<Category> getallCategory();

	public List<Product> getProductsByTitleAndName(String searchCriterion);

	public List<Product> getProductsByTitleNameOrShortDesc(String searchCriterion);

	public List<Product> getAllProducts();

	public List<Cart> getAllItemsInCart();

	public List<Wishlist> getAllItemsInWishlist();
	
	public void addItemToWishlist(String itemId);
	
	public void deleteItemFromWishlist(String itemId);
	
	public void addItemToCart(String itemId);
	
	public void deleteItemFromCart(String itemId);
	
	public void reduceQuantityForItemInCart(String itemId);
	
}
