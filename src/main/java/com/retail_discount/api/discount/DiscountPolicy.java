package com.retail_discount.api.discount;

/*
 * Interface for Overall Discount Policy for all items of cart
 */
public interface DiscountPolicy {
	double applyDiscount(double totalAmount);
}
