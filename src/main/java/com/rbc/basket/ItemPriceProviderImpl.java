/**
 * 
 */
package com.rbc.basket;

import java.util.HashMap;
import java.util.Map;

/**
 * @author verun An implementation of ItemPriceProvider that just looks up
 *         prices in a hashmap.
 */
public class ItemPriceProviderImpl implements ItemPriceProvider {

	private final Map<String, Double> itemToPriceMap;

	public ItemPriceProviderImpl(final Map<String, Double> itemToPriceMap) {
		if (itemToPriceMap == null) {
			throw new IllegalArgumentException("itemToPriceMap cannot be null!");
		}
		this.itemToPriceMap = new HashMap<String, Double>();
		this.itemToPriceMap.putAll(itemToPriceMap);
	}

	public double getPriceForItem(final String item) {
		if (item == null) {
			throw new IllegalArgumentException("item cannot be null!");
		}
		if (itemToPriceMap.containsKey(item)) {
			return itemToPriceMap.get(item);
		}
		throw new ItemPriceNotFoundException("Could not find price for item: " + item);
	}
}
