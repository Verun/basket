/**
 * 
 */
package com.rbc.basket;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author verun Gets a basket by asking the user for items.
 */
public class ConsoleBasketReader implements BasketReader {

	private final String[] items = { "", "Bananas", "Apples", "Oranges", "Peaches", "Lemons" };

	public Basket getBasket() {
		final Basket basket = new Basket();
		final Scanner sc = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("Enter the number (1 - 6) of the item to purchase: ");
				System.out.println("1. Bananas");
				System.out.println("2. Apples");
				System.out.println("3. Oranges");
				System.out.println("4. Peaches");
				System.out.println("5. Lemons");
				System.out.println("6. Exit");

				final int choice = getInt(sc);
				if (choice < 1 || choice > 6) {
					System.out.println("Choice must be between 1 - 6 inclusive!");
				} else if (choice == 6) {
					break;
				} else {
					System.out.println("Enter quantity: ");
					final int quantity = getInt(sc);

					if (quantity <= 0) {
						System.out.println("Quantity must be positive!");
					} else {
						basket.addItem(items[choice], quantity);
						System.out.println("Item accepted, you may enter more items to purchase or exit...");
					}

				}
			}
		} finally {
			sc.close();
		}

		return basket;
	}

	private int getInt(final Scanner sc) {
		while (true) {
			try {
				final int n = sc.nextInt();
				return n;
			} catch (final InputMismatchException e) {
				System.out.println("Please enter a proper integer!");
				sc.nextLine();
			}
		}
	}
}
