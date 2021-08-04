package freightosTask;

public class Product {
	private int position; 
	private String price; 
	private String label;

	Product(String label, String price, int position){
		this.position = position; 
		this.label = label; 
		this.price=price; 
		
	}
	

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "[position=" + position + ", price=" + price + ", " + label + "]"+"\n";
	}


}
