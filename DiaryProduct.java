package Supermarket.products;

public class DiaryProduct extends GroceryProduct{
	private Fat Fat;
public DiaryProduct(String name, double price, double discount, Fat Fat) {
		super(name, price, discount);
		this.Fat = Fat;
	}
public Fat getFat() {
	return Fat;
}
public void setFat(Fat fat) {
	this.Fat = fat;
}

public String toString() {
	return super.toString() + "fatlevel" + Fat;
}
}
