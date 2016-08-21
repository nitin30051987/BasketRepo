package com.rbc.cts.main;

public class Basket {
    public static void main(String[] args) {
	double sum = 0;
	String itemNames[]= {"Bananas","Oranges","Apples","Lemons","Peaches","Bananas"};
	for (int i = 0; i < itemNames.length; i++) {
	       
        switch (itemNames[i]) {
        case "Bananas":
            sum += 2.98; 
            break;
        case "Oranges":
            sum += 4.50;
            break;
        case "Apples":
            sum += 9.98;
           break;
       
        default:
            sum += 0;
            break;
    }
     }	
	System.out.printf("Total cost is %.2f",sum);
}
}
