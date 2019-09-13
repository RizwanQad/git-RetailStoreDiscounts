package com.retail_discount.api;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.retail_discount.api.core.Cart;
import com.retail_discount.api.core.Item;
import com.retail_discount.api.core.ItemType;
import com.retail_discount.api.core.Product;
import com.retail_discount.api.core.User;
import com.retail_discount.api.core.UserType;

/*
 * Test Cases for no discount policy for any type and just to see if cart is working
 */
public class TestWithoutDiscounts {

    private Cart cart;
    private Item item;

    @Before
    public void setUp() {
    	User user = new User(UserType.SIMPLE, "John");
        cart = new Cart(user);
        item = new Product("something", 1000, ItemType.OTHER);
    }

    @Test
    public void test_emptyCartCostsZero() {
        assertEquals(0, cart.total(), 0.01);
    }

    @Test
    public void test_singleBasicItemCostsItsUnitPrice() {
        cart.add(item);
        assertEquals(item.getUnitPrice(), cart.total(), 0.01);
    }

    @Test
    public void test_multipleBasicItemsCostProportionally() {
        int howMany = 3;
        cart.add(item, howMany);
        assertEquals(howMany * item.getUnitPrice(), cart.total(), 0.01);
    }

    @Test
    public void test_separatelyAdding() {
        int howMany = 3;
        for (int i = howMany; i > 0; i--) {
            cart.add(item);
        }
        assertEquals(howMany * item.getUnitPrice(), cart.total(), 0.01);
    }
}
