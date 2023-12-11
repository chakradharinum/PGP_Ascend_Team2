package com.product.mongo.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Document("User")
public class User {

	@Id
	private BigInteger _id;
	private String email;
	private String password;
	private String avtar;
	private String[] favoriteCategories;

	public User(String email, String password, String avtar, String[] favoriteCategories) {
		super();
		this.email = email;
		this.password = password;
		this.avtar = avtar;
		this.favoriteCategories = favoriteCategories;
	}

	public BigInteger get_id() {
		return _id;
	}

	public void set_id(BigInteger _id) {
		this._id = _id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvtar() {
		return avtar;
	}

	public void setAvtar(String avtar) {
		this.avtar = avtar;
	}

	public String[] getFavoriteCategories() {
		return favoriteCategories;
	}

	public void setFavoriteCategories(String[] favoriteCategories) {
		this.favoriteCategories = favoriteCategories;
	}

}
