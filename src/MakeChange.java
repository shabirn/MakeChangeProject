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
        if (twenty > 0 ) {
        	System.out.println(twenty + " Twenty dollar bill");
        }
        
        ten = amount / 1000;
        amount = amount % 1000;
        if (ten > 0 ) {
        	System.out.println(ten + " Ten dollar bill");
        }
        
        five = amount / 500;        
        amount = amount % 500;
        if (five > 0 ) {
        	System.out.println(five + " Five dollar bill");
        }
      
        
        singles = amount / 100;    
        amount = amount % 100;	
        if (singles > 0 ) {
        	System.out.println(singles + "  dollar bill");
        }
        
        quarters = amount / 25;
        amount = amount % 25;
        if (quarters > 0 ) {
        	System.out.println(quarters + " quarters");
        }
        
        dimes = amount / 10;
        amount = amount % 10;
        if (dimes> 0 ) {
        	System.out.println(dimes + " dimes");
        }
       
        nickels = amount / 5;
        amount = amount % 5;
        if (nickels > 0 ) {
        	System.out.println(nickels + " nickels");
        }
        
        pennies = amount;
        if (pennies > 0 ) {
        	System.out.println(pennies + "  pennies");
        }
                
 
		
                 
	
		
	
			
	keyboard.close();

	}

}
