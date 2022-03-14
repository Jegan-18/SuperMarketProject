package Supermarket.products;

public class BeverageProduct extends GroceryProduct implements Drinkable{
	private SugarLevel SugarLevel;
public BeverageProduct(String name, double price, double discount, SugarLevel SugarLevel) {
		super(name, price, discount);
		this.SugarLevel = SugarLevel;
	}
public SugarLevel getSugarLevel() {
	return SugarLevel;
}
public void setSugarLevel(SugarLevel sugarLevel) {
	SugarLevel = sugarLevel;
}

public String toString() {
	return super.toString() + "Sugarlevel" + SugarLevel;

}
@Override
public boolean isHealthy() {
	return SugarLevel != SugarLevel.added_sugar;
}

}
