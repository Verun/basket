package com.rbc.basket;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

/**
 * Tests the Basket class.
 * 
 * @author verun
 *
 */
public class BasketTest {

	@Test
	public void handlesDuplicatesTest() {
		final Basket toTest = new Basket();
		toTest.addItem("one", 5);
		toTest.addItem("two", 3);
		toTest.addItem("one", 4);

		final Map<String, Integer> allItems = toTest.getAllItems();
		assertEquals(2, allItems.size());
		assertEquals(9, allItems.get("one").intValue());
		assertEquals(3, allItems.get("two").intValue());
	}
}
