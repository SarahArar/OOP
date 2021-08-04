package freightosTask;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CoinSlots extends Coins {
    private int tenCents ; 
    private int twentyCents; 
    private int fiftyCents; 
	private double itemPrice; 
	private static double total=0;

	int amount; 
	static Scanner input = new Scanner(System.in);
	
	
	

	
	CoinSlots(double itemPrice){
		this.itemPrice = itemPrice; 
	}
	
	public int getTenCents() {
		return tenCents;
	}

	public int getTwentyCents() {
		return twentyCents;
	}

	public int getFiftyCents() {
		return fiftyCents;
	}

	public double getItemPrice() {
		return itemPrice;
	}
	@Override
	public double addBalance(){
		int retValue =0; 
		amount =  input.nextInt(); 
		double iPrice = getItemPrice(); 
		total +=amount; 
		//Checking money type
		
		Set<Integer> money = new HashSet<Integer>();
		money.add(10);money.add(20);money.add(50);money.add(100);

		if(money.contains(amount)) {
				if((iPrice-total) ==0 ) {
					total = iPrice; 
					System.out.println("Current Balance :"+total+"Remain "+ '0');
					System.out.println("Done");
				}else if (total < iPrice) {
					System.out.println("Remain "+(iPrice-total));
					System.out.println("Current Balance"+total);
					addBalance();
				}
				
		else if (total > iPrice){
					//I need to check if the vending machine bucket has more money than total 
					double exchange = total - iPrice; 
					System.out.println("Exchange value : "+exchange+"c");
					
					//uncompleted algorithm for returning process
					
					
//					while(exchange != 0) {
//						
//						if (exchange >10 || exchange <20) {
//							exchange  = exchange - 10;
//							return exchange; 
//							
//						}else if(exchange >20 || exchange <50) {
//							exchange  = exchange - 20;
//							return exchange; 
//
//							
//						}else if(exchange >50 || exchange <100) {
//						
//							exchange  = exchange - 50;
//							return exchange; 
//
//
//					}
//					}
					
					return exchange;  
				}}else {
					System.out.println("You Can Only pay with 10c , 20c or 50c ");
				}
				
			
		
		return retValue; 
	}
 
}
