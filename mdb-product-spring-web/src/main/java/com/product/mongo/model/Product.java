package com.product.mongo.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Document("product")
public class Product {

	@Id
	private BigInteger _id;
	private BigInteger id;
	private String title;
	private BigInteger minQuantity;
	private String gender;
	private String iconUrl;
	private String shortDescription;
	private String longDescription;
	private String productName;
	private String productCategory;
	private String inventryStatus;
	private BigInteger availableQuantity;
	private String purchasable;
	private String[] searchTags;
	private String model;
	private String brand;
	private String specification;
	private BigInteger warrantyDuration;
	private String[] imageUrls;
	private BigInteger orderLimit;
	private BigInteger returnDates;
	private BigInteger length;
	private BigInteger width;
	private BigInteger height;
	
	public Product(BigInteger id, String title, BigInteger minQuantity, String gender, String iconUrl,
			String shortDescription, String longDescription, String productName, String productCategory,
			String inventryStatus, BigInteger availableQuantity, String purchasable, String[] searchTags, String model,
			String brand, String specification, BigInteger warrantyDuration, String[] imageUrls, BigInteger orderLimit,
			BigInteger returnDates, BigInteger length, BigInteger width, BigInteger height, double weight,
			Object ratings, Boolean isElegibileForPromotion, BigInteger discount, String isHazardous,
			String isReturnable) {
		super();
		this.id = id;
		this.title = title;
		this.minQuantity = minQuantity;
		this.gender = gender;
		this.iconUrl = iconUrl;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.productName = productName;
		this.productCategory = productCategory;
		this.inventryStatus = inventryStatus;
		this.availableQuantity = availableQuantity;
		this.purchasable = purchasable;
		this.searchTags = searchTags;
		this.model = model;
		this.brand = brand;
		this.specification = specification;
		this.warrantyDuration = warrantyDuration;
		this.imageUrls = imageUrls;
		this.orderLimit = orderLimit;
		this.returnDates = returnDates;
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.ratings = ratings;
		this.isElegibileForPromotion = isElegibileForPromotion;
		this.discount = discount;
		this.isHazardous = isHazardous;
		this.isReturnable = isReturnable;
	}

	private double weight;
	private Object ratings;
	private Boolean isElegibileForPromotion;
	private BigInteger discount;
	private String isHazardous;
	private String isReturnable;

	public BigInteger get_id() {
		return _id;
	}

	public void set_id(BigInteger _id) {
		this._id = _id;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigInteger getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(BigInteger minQuantity) {
		this.minQuantity = minQuantity;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getInventryStatus() {
		return inventryStatus;
	}

	public void setInventryStatus(String inventryStatus) {
		this.inventryStatus = inventryStatus;
	}

	public BigInteger getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(BigInteger availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public String getPurchasable() {
		return purchasable;
	}

	public void setPurchasable(String purchasable) {
		this.purchasable = purchasable;
	}

	public String[] getSearchTags() {
		return searchTags;
	}

	public void setSearchTags(String[] searchTags) {
		this.searchTags = searchTags;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public BigInteger getWarrantyDuration() {
		return warrantyDuration;
	}

	public void setWarrantyDuration(BigInteger warrantyDuration) {
		this.warrantyDuration = warrantyDuration;
	}

	public String[] getImageUrls() {
		return imageUrls;
	}

	public void setImageUrls(String[] imageUrls) {
		this.imageUrls = imageUrls;
	}

	public BigInteger getOrderLimit() {
		return orderLimit;
	}

	public void setOrderLimit(BigInteger orderLimit) {
		this.orderLimit = orderLimit;
	}

	public BigInteger getReturnDates() {
		return returnDates;
	}

	public void setReturnDates(BigInteger returnDates) {
		this.returnDates = returnDates;
	}

	public BigInteger getLength() {
		return length;
	}

	public void setLength(BigInteger length) {
		this.length = length;
	}

	public BigInteger getWidth() {
		return width;
	}

	public void setWidth(BigInteger width) {
		this.width = width;
	}

	public BigInteger getHeight() {
		return height;
	}

	public void setHeight(BigInteger height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Object getRatings() {
		return ratings;
	}

	public void setRatings(Object ratings) {
		this.ratings = ratings;
	}

	public Boolean getIsElegibileForPromotion() {
		return isElegibileForPromotion;
	}

	public void setIsElegibileForPromotion(Boolean isElegibileForPromotion) {
		this.isElegibileForPromotion = isElegibileForPromotion;
	}

	public BigInteger getDiscount() {
		return discount;
	}

	public void setDiscount(BigInteger discount) {
		this.discount = discount;
	}

	public String getIsHazardous() {
		return isHazardous;
	}

	public void setIsHazardous(String isHazardous) {
		this.isHazardous = isHazardous;
	}

	public String getIsReturnable() {
		return isReturnable;
	}

	public void setIsReturnable(String isReturnable) {
		this.isReturnable = isReturnable;
	}

}
