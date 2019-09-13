package com.retail_discount.api.discount.item;

import com.retail_discount.api.core.Item;
import com.retail_discount.api.core.ItemType;

/*
 * Class to implement pricing at item level
 */
public class PricingPolicy implements Item {

    private final Item baseItem;

    public PricingPolicy(Item baseItem) {
        this.baseItem = baseItem;
    }

    public double getUnitPrice() { 
    	return baseItem.getUnitPrice();
    }

    public String getName() { 
    	return baseItem.getName(); 
    }
    
    public ItemType getType() {
    	return baseItem.getType(); 
    }

    public double priceForQuantity(int quantity) {
        return baseItem.priceForQuantity(quantity);
    }
}
