package com.retail_discount.api.discount.item;

import com.retail_discount.api.core.Item;
import com.retail_discount.api.core.ItemType;

/*
 * Class to implement pricing at item level
 */
public class PricingPolicy implements Item {

	private final Item baseItem;

	/**
	 * 
	 * @param baseItem
	 */
	public PricingPolicy(Item baseItem) {
		this.baseItem = baseItem;
	}

	/**
	 * @return baseItem.getUnitPrice()
	 */
	public double getUnitPrice() {
		return baseItem.getUnitPrice();
	}

	/**
	 * @return baseItem.getName()
	 */
	public String getName() {
		return baseItem.getName();
	}

	/**
	 * @return baseItem.getType()
	 */
	public ItemType getType() {
		return baseItem.getType();
	}

	/**
	 * @param quantity
	 * @return baseItem.priceForQuantity(quantity)
	 */
	public double priceForQuantity(int quantity) {
		return baseItem.priceForQuantity(quantity);
	}
}
