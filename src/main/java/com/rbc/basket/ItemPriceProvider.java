/**
 * 
 */
package com.rbc.basket;

/**
 * @author verun Provides prices for items.
 */
public interface ItemPriceProvider {

	/**
	 * Return the price for an item.
	 * 
	 * @param item
	 *            The item for which the price is to be returned.
	 * @return The item price.
	 * @throws ItemPriceNotFoundException
	 *             if the item could not be found.
	 */
	double getPriceForItem(String item);
}
