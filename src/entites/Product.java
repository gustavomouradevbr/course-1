package entites;

public class Product {
	
	//attributes
	
	public String name;
	public double price;
	public int quantity;
	
	//method
	public double totalValueInStock() {
		return price * quantity;
		
	}
	
	//method void
	public void addProducts(int quantity) {
		this.quantity += quantity;	
	
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;	
	
	}
	
	//method toString
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}


}

