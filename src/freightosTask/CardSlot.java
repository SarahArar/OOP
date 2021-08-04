package freightosTask;

public class CardSlot extends Coins {
    
	
	private double itemPrice; 
	private double bankBalance =1000; 

	CardSlot(double itemPrice){
		this.itemPrice = itemPrice; 
	}
	 
	public double getItemPrice() {
		return itemPrice;
	}

	public double getBankBalance() {
		return bankBalance;
	}

	@Override
	public double addBalance() {
		int retValue = 0 ;
		double itemPrice = getItemPrice();
		//checking if bank account has more values than price
		if (itemPrice < bankBalance) {
			bankBalance = Math.floor(bankBalance -itemPrice); 
			System.out.println("Payment Process done. You can pull your credit card!");
		}else {
			System.out.println("SORRY !You Can not buy this item");
		}
		 
		
		return 0;
	}


}
