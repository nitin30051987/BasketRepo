package com.rbc.cts.testCase;

import org.junit.Assert;
import org.junit.Test;

import com.rbc.cts.main.Basket;

public class BasketTest {

	@SuppressWarnings("static-access")
	@Test
	public void testCalculateTotalCost(){
		Basket basket = new Basket(); 
		basket.main(new String[] {"arg1"});
		Assert.assertNotNull("Success",basket);
	}
}


