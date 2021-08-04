package freightosTask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class main {
	public final static int ArraySize =25; 
	public static void main(String[] args) throws Exception {
		// building an test object 
		SnackMachine obj1 = new SnackMachine(); 
		obj1.primarMessage(); 
		
		//printing the vending machine items
		File file = new File("vendingSnacks.txt");
	
		Scanner scan = new Scanner(file);
		Scanner scanner = new Scanner(System.in);
	    scan.useDelimiter(",");
	    //Initializing an array of objects 
     	Product [] product= new Product[ArraySize];
    	
		for (int i=0 ; i<ArraySize ; i++) {
			String line = scan.nextLine();
			String[] txtList = line.split(",");

		    String label = txtList[0] ; 
		    String price = txtList[1]; 
			product[i] = new Product(label,price,i);
			
			}
		//printing the vendingMachine items 
		
		for (int j=0 ; j<ArraySize ; j++) {
			
			System.out.println(product[j].toString() );
		}
		
//			System.out.println(Arrays.toString(product));
			
	//Taking the position of item from user 
            System.out.println("Enter your Item position : ");
            int place  =scanner.nextInt(); 	
            if (place >= ArraySize) throw new Exception ("Position must be less than"+ArraySize); 
             System.out.println("Your Item information:"+obj1.selectItemPosition(place, product));
                   
             String cost = product[place].getPrice(); 
             
             //Chossing paymente technique 
              System.out.println("*****************************Choose your way of payment***********************************"+"\n"+" 1 for Cash"+" 2 for Credit Card ");
              
              int paymentTechnique = scanner.nextInt(); 
              
              switch(paymentTechnique) {
               
              case 1:
             //checking type of currency used : cents or dollars
             if (cost.contains("c")) {
            	 String strNew = cost.replace("c", "");
            	 double itemPrice = Double.parseDouble(strNew); 
              	 CoinSlots coinslot = new CoinSlots(itemPrice); 
              	 System.out.println("Item Price is :"+coinslot.getItemPrice());
              	 coinslot.addBalance(); 
              	 
             }
             //Paying in dollars section 
             else if (cost.contains("$")) {
            	 System.out.println("Pay using dollar ");
            	 String strNew = cost.replace("$", "");
            	 int itemPrice = Integer.parseInt(strNew); 
              	 NoteSlots noteSlot = new NoteSlots(itemPrice); 
              	 System.out.println("Item Price is :"+noteSlot.getItemPrice());
              	noteSlot.addBalance();
            	 
             }else {
            	 System.out.println("we are done");
             }
             break; 
            case 2:
            	System.out.println("Payment using credit card");
            	 if (cost.contains("c")) {
                	 String strNew = cost.replace("c", "");
                	 int itemPrice = Integer.parseInt(strNew);
                  	 CardSlot cardSlot = new CardSlot(itemPrice); 
 	               	cardSlot.addBalance(); 	

				}else if(cost.contains("$")){
				   	String strNew = cost.replace("$", "");
			     	 int itemPrice = Integer.parseInt(strNew);
	              	 CardSlot cardSlot = new CardSlot(itemPrice); 
	               	cardSlot.addBalance(); 	
	              	}
            	 
		
	}
              
	}
}
	
	
	
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
