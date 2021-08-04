package freightosTask;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NoteSlots extends Coins {
     
	private int twentDollar; 
	private int fiftyDollar; 
	private int oneDollar; 
	private double itemPrice; 
	
	private static double total=0;

	int amount; 
	static Scanner input = new Scanner(System.in);
	
	
	
	
	
	
	NoteSlots(double itemPrice){
		this.itemPrice = itemPrice; 
	}
	

	public int getTwentDollar() {
		return twentDollar;
	}
	public int getFiftyDollar() {
		return fiftyDollar;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	@Override
	public double addBalance() {
		int retValue =0; 
		Set<Integer> money = new HashSet<Integer>();
		money.add(1);money.add(10);money.add(20);

		amount =  input.nextInt(); 
		double iPrice = getItemPrice(); 
		total +=amount; 
		//Checking money type
		if (money.contains(amount))
		{
				if((iPrice-total) ==0 ) {
					total = iPrice; 
					System.out.println("Done");
				}else if (total < iPrice) {
					System.out.println("Remain "+(iPrice-total));
					addBalance();
				
				}else if (total > iPrice){
					//I need to check if the vending machine bucket has more money than total 
					
					
					double exchange = total - iPrice; 
					System.out.println("Exchange value : "+exchange);
					return exchange;  
				}else {
					System.out.println("Error");
				}
				}else {
					System.out.println("YOU CAN ONLY INSERT  20$ OR 50$ ");
				}
				return retValue; 
		}
		    
			
	}




