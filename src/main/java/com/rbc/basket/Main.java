/**
 * 
 */
package com.rbc.basket;

import java.util.HashMap;
import java.util.Map;

/**
 * @author verun Entry point.
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {

		final ItemPriceProvider ipp = new ItemPriceProviderImpl(new HashMap<String, Double>() {
			{
				put("Bananas", 0.5);
				put("Apples", 0.25);
				put("Lemons", 0.33);
				put("Peaches", 0.74);
				put("Oranges", 0.33);

			}
		});

		final BasketReader br = new ConsoleBasketReader();
		final Basket basket = br.getBasket();

		final Main mn = new Main();
		final double finalCost = mn.getFinalCost(basket, ipp);
		System.out.println(String.format("The total cost is: $%.2f", finalCost));

	}

	double getFinalCost(final Basket b, final ItemPriceProvider ipp) {
		double total = 0.0;
		System.out.println("Using the following prices for each item:");
		for (final Map.Entry<String, Integer> kvp : b.getAllItems().entrySet()) {
			total += ipp.getPriceForItem(kvp.getKey()) * kvp.getValue();
			System.out.println(String.format("%s: $%.2f (%d items)", kvp.getKey(), ipp.getPriceForItem(kvp.getKey()),
					kvp.getValue()));
		}
		return total;
	}

}
