package com.product.mongo.service.impl;

import java.math.BigInteger;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.mongo.model.Cart;
import com.product.mongo.model.Category;
import com.product.mongo.model.Product;
import com.product.mongo.model.User;
import com.product.mongo.model.Wishlist;
import com.product.mongo.repository.CartRepository;
import com.product.mongo.repository.CategoryRepository;
import com.product.mongo.repository.ProductRepository;
import com.product.mongo.repository.UserRepository;
import com.product.mongo.repository.WishlistRepository;
import com.product.mongo.service.ProductService;

@Service
public class ProductSerivceImpl implements ProductService {

	private static Logger logger = LoggerFactory.getLogger(ProductSerivceImpl.class);

	@Autowired
	WishlistRepository wishlistRepository;

	@Autowired
	CartRepository cartRepository;

	@Autowired
	ProductRepository productRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Product getProductByName(String pname) {
		return productRepository.findProductByName(pname);
	}

	@Override
	public List<Product> getAllProductByCategory(String pcategory) {
		return productRepository.findByProductCategory(pcategory);
	}

	@Override
	public User getUserByEmail(String uemail) {
		return userRepository.checkUserInfo(uemail);
	}

	@Override
	public List<Category> getallCategory() {
		return categoryRepository.getAllCategories();
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

	@Override
	public List<Product> getProductsByTitleNameOrShortDesc(String searchCriterion) {
		return productRepository.findProductsByTitleAndName(searchCriterion);
	}

	@Override
	public List<Product> getProductsByTitleAndName(String searchCriterion) {
		return productRepository.findProductsByTitleAndName(searchCriterion);
	}

	@Override
	public List<Cart> getAllItemsInCart() {
		return cartRepository.getAllItemsInCart();
	}

	@Override
	public List<Wishlist> getAllItemsInWishlist() {
		return wishlistRepository.getAllItemsInWishlist();
	}

	@Override
	public void addItemToWishlist(String itemId) {
		try {
			List<Wishlist> wishListItemsInRepository = wishlistRepository.getAllItemsInWishlist();
			BigInteger itemId_bigInt = new BigInteger(itemId);
			boolean itemExists = false;

			for (Wishlist wishlistItemInRepository : wishListItemsInRepository) {
				if (wishlistItemInRepository.getItemId().equals(itemId_bigInt)) {
					itemExists = true;
					break;
				}
			}
			if (itemExists == false) {
				// wishlistRepository.addItemToWishlist(itemId_bigInt);
				wishlistRepository.save(new Wishlist(itemId_bigInt));
			}
		} catch (Exception e) {
			logger.error("Error adding item to wishlist");
		}
	}

	@Override
	public void deleteItemFromWishlist(String itemId) {
		try {
			List<Wishlist> wishListItemsInRepository = wishlistRepository.getAllItemsInWishlist();
			BigInteger itemId_bigInt = new BigInteger(itemId);
			boolean itemExists = false;
			Wishlist wishlistItemToDelete = null;

			for (Wishlist wishlistItemInRepository : wishListItemsInRepository) {
				if (wishlistItemInRepository.getItemId().equals(itemId_bigInt)) {
					itemExists = true;
					wishlistItemToDelete = wishlistItemInRepository;
					break;
				}
			}
			if (itemExists == true) {
				// wishlistRepository.deleteItemFromWishlist(itemId_bigInt);
				wishlistRepository.delete(wishlistItemToDelete);
			}
		} catch (Exception e) {
			logger.error("Error deleting item from wishlist");
		}

	}

	@Override
	public void addItemToCart(String itemId) {
		try {
			List<Cart> cartItemsInRepository = cartRepository.getAllItemsInCart();
			BigInteger itemId_bigInt = new BigInteger(itemId);
			boolean itemExists = false;
			Cart cartItemToAddQuantity = null;

			for (Cart cartItemInRepository : cartItemsInRepository) {
				if (cartItemInRepository.getItemId().equals(itemId_bigInt)) {
					itemExists = true;
					cartItemToAddQuantity = cartItemInRepository;
					break;
				}
			}

			if (itemExists == true) {
				cartItemToAddQuantity.setQuantity(cartItemToAddQuantity.getQuantity().add(BigInteger.ONE));
				cartRepository.save(cartItemToAddQuantity);
			} else if (itemExists == false) {
				cartRepository.save(new Cart(itemId_bigInt, BigInteger.ONE));
			}
		} catch (Exception e) {
			logger.error("Error adding item to cart");
		}

	}

	@Override
	public void reduceQuantityForItemInCart(String itemId) {
		try {
			List<Cart> cartItemsInRepository = cartRepository.getAllItemsInCart();
			BigInteger itemId_bigInt = new BigInteger(itemId);
			boolean itemExists = false;
			Cart cartItemToReduceQuantity = null;

			for (Cart cartItemInRepository : cartItemsInRepository) {
				if (cartItemInRepository.getItemId().equals(itemId_bigInt)) {
					itemExists = true;
					cartItemToReduceQuantity = cartItemInRepository;
					break;
				}
			}

			if (itemExists == true) {
				if (cartItemToReduceQuantity.getQuantity().equals(BigInteger.ONE)) {
					cartRepository.delete(cartItemToReduceQuantity);
				} else {
					cartItemToReduceQuantity
							.setQuantity(cartItemToReduceQuantity.getQuantity().subtract(BigInteger.ONE));
					cartRepository.save(cartItemToReduceQuantity);
				}
			}
			else {
				logger.error("Item does not exist in cart");
			}
		} catch (Exception e) {
			logger.error("Error deleting item from cart");
		}
	}

	@Override
	public void deleteItemFromCart(String itemId) {
		try {
			List<Cart> cartItemsInRepository = cartRepository.getAllItemsInCart();
			BigInteger itemId_bigInt = new BigInteger(itemId);
			for (Cart cartItemInRepository : cartItemsInRepository) {
				if (!cartItemInRepository.getItemId().equals(itemId_bigInt)) { // reduce quantity for existing item in
																				// cart
					// cartRepository.deleteItemFromCart(itemId_bigInt);
					cartRepository.deleteById(itemId_bigInt);
					break;
				}
			}
		} catch (Exception e) {
			logger.error("Error deleting item from cart");
		}

	}

}
