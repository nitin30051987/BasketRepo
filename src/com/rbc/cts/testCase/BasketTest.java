package com.rbc.cts.testCase;

import org.junit.Assert;
import org.junit.Test;

import com.rbc.cts.main.Basket;
import com.rbc.cts.main.FruitsPrice;

@SuppressWarnings("static-access")
public class BasketTest {

	
	@Test
	public void testCalculateTotalPrice(){
		Basket basket = new Basket(); 
		basket.calculateTotalPrice(new String[] {"Bananas","Oranges","Apples","Lemons","Peaches","abc",null});
		Assert.assertNotNull("Success",basket);
		
		
	}
	
	
	@Test
	public void testmain(){
		Basket basket = new Basket(); 
		basket.main(new String[] {"main"});
		Assert.assertNotNull("Success",basket);
		
	}
	
	@Test
	public void testFruitsPrice(){
		 
		Assert.assertNotNull(FruitsPrice.Bananas);
		Assert.assertNotNull(FruitsPrice.Apples);
		Assert.assertNotNull(FruitsPrice.Lemons);
		Assert.assertNotNull(FruitsPrice.Oranges);
		Assert.assertNotNull(FruitsPrice.Peaches);
		
	}
}


