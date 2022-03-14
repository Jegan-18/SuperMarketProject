package Supermarket.products;

public abstract class GroceryProduct {
	   private String name;
	   private double price;
	   private double discount;
	   
	   public GroceryProduct(String name,double price,double discount) {
		   super();
		   this.name = name;
		   this.price = price;
		   this.discount = discount;
	   }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public double getActualPrice() {
		return (price - (price * discount/100));
		
	}
	
	public String toString() {
		return ("name : " + name + "price :" + price + " discount:" + discount);
	}
			
}
