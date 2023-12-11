package com.product.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.mongo.model.Cart;
import com.product.mongo.model.Category;
import com.product.mongo.model.Product;
import com.product.mongo.model.User;
import com.product.mongo.model.Wishlist;
import com.product.mongo.service.ProductService;

@RestController
@RequestMapping("products")
public class ProductController {

	@Autowired
	ProductService productService;

	@CrossOrigin
	@GetMapping("user/{uemail}")
	public User validateUserInfo(@PathVariable("uemail") String uemail) {
		return productService.getUserByEmail(uemail);
	}

	@CrossOrigin
	@GetMapping("name/{pname}")
	public Product getAllProductsByName(@PathVariable("pname") String pname) {
		return productService.getProductByName(pname);
	}

	@CrossOrigin
	@GetMapping("category/{pcategory}")
	public List<Product> getAllProductsByCategory(@PathVariable("pcategory") String pcategory) {
		return productService.getAllProductByCategory(pcategory);
	}

	@CrossOrigin
	@GetMapping("categorylist")
	public List<Category> displayallCategory() {
		return productService.getallCategory();
	}

	@CrossOrigin
	@GetMapping("searchProductsByTitleAndName/{searchCriterion}")
	public List<Product> searchProductByTitleAndName(@PathVariable("searchCriterion") String searchCriterion) {
		return productService.getProductsByTitleAndName(searchCriterion);
	}

	@CrossOrigin
	@GetMapping("searchProductsByTitleNameOrShortDesc/{searchCriterion}")
	public List<Product> searchProductsByTitleNameOrShortDesc(@PathVariable("searchCriterion") String searchCriterion) {
		return productService.getProductsByTitleNameOrShortDesc(searchCriterion);
	}
	
	@CrossOrigin
	@GetMapping("allProducts")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	@CrossOrigin
	@GetMapping("allItemsInCart")
	public List<Cart> getAllItemsInCart() {
		return productService.getAllItemsInCart();
	}
	
	@CrossOrigin
	@GetMapping("allItemsInWishlist")
	public List<Wishlist> getAllItemsInWishlist() {
		return productService.getAllItemsInWishlist();
	}
	
	@CrossOrigin
	@PostMapping("addItemToWishlist/{itemId}")
	public void addItemToWishlist(@PathVariable("itemId") String itemId) {
		productService.addItemToWishlist(itemId);
	}
	
	@CrossOrigin
	@PostMapping("deleteItemFromWishlist/{itemId}")
	public void deleteItemFromWishlist(@PathVariable("itemId") String itemId) {
		productService.deleteItemFromWishlist(itemId);
	}
	
	@CrossOrigin
	@PostMapping("addItemToCart/{itemId}")
	public void addItemToCart(@PathVariable("itemId") String itemId) {
		productService.addItemToCart(itemId);
	}
	
	@CrossOrigin
	@PostMapping("reduceQuantityForItemInCart/{itemId}")
	public void reduceQuantityForItemInCart(@PathVariable("itemId") String itemId) {
		productService.reduceQuantityForItemInCart(itemId);
	}
}
