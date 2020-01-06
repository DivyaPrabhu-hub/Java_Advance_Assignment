package Java_Advance_Assignment;

import java.util.Scanner;

public class Assignment_5 {
	
	//Write a program to read monetary amount in cents and print the smallest possible number of coins equaling the amount. *
     
	/* 1 dollar = 100 cents
	 * 1 quarter = 25 cents
	 * 1 dime  = 10 cents
	 * 1 nickle = 5 cents
	 * 1 penny = 1 cen
	 */ 
	public static void main(String[] args){
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("enter the monetary amount in cents");
    	 int cents = sc.nextInt();
    	 
    	 //dollar
    	 int dollar = cents/100;
    	 int remainingcents = (cents%100);
    	 System.out.println("Dollar is " + dollar);
    	 System.out.println("remaining cents is : " + remainingcents);
    	 
    	//Quarter 
    	 int quarter = remainingcents/25;
    	 remainingcents = (remainingcents%25);
    	 System.out.println("Quarter is " + quarter);
    	 System.out.println("remaining cents is : " + remainingcents);
    	 
    	//dime 
    	 int dime = remainingcents/10;
    	 remainingcents = (remainingcents%10);
    	 System.out.println("Dime is " + dime);
    	 System.out.println("remaining cents is : " + remainingcents);
    	 
    	//nickle 
    	 int nickle = remainingcents/5;
    	 remainingcents = (remainingcents%5);
    	 System.out.println("Nickle is " + nickle);
    	 System.out.println("remaining cents is : " + remainingcents);
    	 
    	//penny 
    	 int penny = remainingcents/1;
    	 remainingcents = (remainingcents%1);
    	 System.out.println("Penny is " + penny);
    	 System.out.println("remaining cents is : " + remainingcents);
    	 
    	 
    	 System.out.println("Total number of possible coins equaling the " + cents + "monetary amount is " + (dollar+quarter+dime+nickle+penny));
       }
	
}
	

