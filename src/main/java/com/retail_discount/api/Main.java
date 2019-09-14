package com.retail_discount.api;

import java.time.LocalDateTime;

import com.retail_discount.api.core.Cart;
import com.retail_discount.api.core.Item;
import com.retail_discount.api.core.ItemType;
import com.retail_discount.api.core.Product;
import com.retail_discount.api.core.User;
import com.retail_discount.api.core.UserType;
import com.retail_discount.api.discount.DiscountPolicy;
import com.retail_discount.api.discount.ThresholdDiscount;

class Main {
	public static void main(String[] args) {

		// For normal user
		LocalDateTime now = LocalDateTime.now();
		User customer = new User(UserType.SIMPLE, "Jany", now.minusMonths(25));

		// For employee and affiliate
		User employee = new User(UserType.AFFILIATE, "Jesica");
		/*
		 * Item groceryItem = new Product("Rice", 20, ItemType.GROCERY); Item otherItem
		 * = new Product("TV", 222, ItemType.OTHER);
		 */

		Item groceryItem = new Product("Rice", 20, ItemType.GROCERY);
		Item otherItem = new Product("TV", 40, ItemType.OTHER);
		DiscountPolicy discountPolicy = new ThresholdDiscount();

		Cart cart = new Cart(customer, discountPolicy);
		// cart.add(groceryItem, 4);
		cart.add(otherItem, 4);
		/*
		 * Total (20 * 4) + (222 * 4) = 968 No discount on grocery items = 968 still
		 * After 30% discount on 4 other items totaling 888 = 701.6 After 35 dollars off
		 * due to price over $700 = 666.59999 or 666.6
		 */
		System.out.println(cart.total());
	}
}