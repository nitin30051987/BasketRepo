package com.rbc.cts.main;

public class Basket implements BasketImpl {
	double sum = 0;
	
	@Override
	public double calculateTotalPrice(String[] itemNames){
				
		for (int i = 0; i < itemNames.length; i++) {
			if(null!=itemNames[i]){       
	        switch (itemNames[i]) {
	        case "Bananas":
	            sum += FruitsPrice.Bananas; 
	            break;
	        case "Oranges":
	            sum += FruitsPrice.Oranges;
	            break;
	        case "Apples":
	            sum += FruitsPrice.Apples;
	           break;
	        case "Lemons":
	            sum += FruitsPrice.Lemons;
	           break;
	        case "Peaches":
	            sum += FruitsPrice.Peaches;
	           break;
	        default:
	            sum += 0;
	            break;
	            
	    }
	     }	
		
		}
		
		return sum;
	}
	
    public static void main(String[] args) {
	
	String itemNames[]= {"Bananas","Oranges","Apples","Lemons","Peaches","Bananas"};
    	Basket basket = new Basket();
    	double totalPrice = basket.calculateTotalPrice(itemNames);
    	System.out.println(totalPrice);

}
}
