import java.util.Scanner;


public class MakeChange {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double purchasePrice, amountTendered, changeAmount;
		long amount, twenty, ten, five, singles, quarters, dimes, nickels, pennies;
		
		System.out.println("Please enter the purchase price?");
		purchasePrice = keyboard.nextDouble();
		
		System.out.println("Please enter amount tendered.");
		amountTendered = keyboard.nextDouble();
		
		if(amountTendered < purchasePrice) {
			System.err.println("insufficent funds.  enter amount tendered");
		}
		if(amountTendered == purchasePrice) {
			System.out.println("Exact amount tendered");
		} 
		
		
		changeAmount = amountTendered - purchasePrice;
		
		
        long changeMultiplied = Math.round(changeAmount*100);
        
         amount = changeMultiplied;
        
        twenty = amount / 2000;
        amount = amount % 2000;
        ten = amount / 1000;
        amount = amount % 1000;
        five = amount / 500;
        amount = amount % 500;
        singles = amount / 100;
        amount = amount % 100;		
        quarters = amount / 25;
        amount = amount % 25;
        dimes = amount / 10;
        amount = amount % 10;
        nickels = amount / 5;
        amount = amount % 5;
        pennies = amount;
                 
                 System.out.println(twenty);
                 System.out.println(ten);
                 System.out.println(five);
                 System.out.println(singles);
                		                           
                		        System.out.println(quarters + " quarters");
                		         System.out.println(dimes + " dimes");
                		         System.out.println(nickels + " nickels and");
                		        System.out.println(pennies + " pennies");
		
                 
	
		
	
			
	keyboard.close();

	}

}
