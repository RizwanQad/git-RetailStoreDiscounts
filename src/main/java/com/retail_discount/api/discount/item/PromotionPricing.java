package com.retail_discount.api.discount.item;

import com.retail_discount.api.core.Item;
import com.retail_discount.api.core.ItemType;

/*
 * Class to apply percentage discount on items based on type
 */
public class PromotionPricing extends PricingPolicy {

	private final double priceFactor;

	/**
	 * 
	 * @param baseItem
	 * @param percentPromotion
	 */
	public PromotionPricing(Item baseItem, int percentPromotion) {
		super(baseItem);
		if (percentPromotion < 0 || percentPromotion > 100) {
			throw new IllegalArgumentException("percentPromotion must be in [0,100]");
		}
		this.priceFactor = (100 - percentPromotion) / 100.0;
	}

	/**
	 * @param quantity
	 */
	@Override
	public double priceForQuantity(int quantity) {
		// If Grocery then don't apply the percentage discount
		if (super.getType() == ItemType.GROCERY) {
			return super.priceForQuantity(quantity);
		}

		// else apply percentage discount
		return (super.priceForQuantity(quantity) * priceFactor);
	}
}
