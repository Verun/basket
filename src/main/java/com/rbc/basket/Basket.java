/**
 * 
 */
package com.rbc.basket;

import java.util.HashMap;
import java.util.Map;

/**
 * @author verun A basket of items.
 */
public class Basket {

	private final Map<String, Integer> itemToQuantityMap = new HashMap<String, Integer>();

	public void addItem(final String item, final int quantity) {
		int newCount = quantity;
		if (itemToQuantityMap.containsKey(item)) {
			final int currentCount = itemToQuantityMap.get(item);
			newCount += currentCount;
		}
		itemToQuantityMap.put(item, newCount);
	}

	public Map<String, Integer> getAllItems() {
		final Map<String, Integer> toReturn = new HashMap<String, Integer>();
		toReturn.putAll(itemToQuantityMap);
		return toReturn;
	}

}
