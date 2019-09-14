package com.retail_discount.api.core;

/*
 * Class for actual product items
 */
public class Product implements Item {

	private final String name;
	private final double unitPrice;
	private final ItemType type;

	/**
	 * 
	 * @param name
	 * @param priceInDollars
	 * @param type
	 */
	public Product(String name, double priceInDollars, ItemType type) {
		this.name = name;
		this.unitPrice = priceInDollars;
		this.type = type;
	}

	/**
	 * @return unitPrice
	 */
	public double getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param quantity
	 * @return unitPrice * quantity
	 */
	public double priceForQuantity(int quantity) {
		return unitPrice * quantity;
	}

	/**
	 * @return type
	 */
	public ItemType getType() {
		return type;
	}
}
