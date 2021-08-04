package freightosTask;

public class SnackMachine  implements vendingMachine {
   
	
	public double vendingMoney = 10.000; 
	
	

	@Override
	public void primarMessage() {
        System.out.println("********************************Menu items*******************************************");		
	}
	public  Object selectItemPosition(int position,Object[] item ) {
		//returning the object specified with position
		return item[position]; 
	}

}
