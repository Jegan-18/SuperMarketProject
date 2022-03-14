package Supermarket.products;

public class Cart {

	public static void main(String[] args) {
		BeverageProduct sprite = new BeverageProduct("Sprite", 2.2, 10, SugarLevel.light);
		BeverageProduct cola = new BeverageProduct("Cola", 4.2, 20, SugarLevel.added_sugar);
		
		DiaryProduct curd = new DiaryProduct("curd", 3.2, 16, Fat.Fullcream);
		DiaryProduct milk = new DiaryProduct("milk", 5.2, 26, Fat.halfcream);
		
		System.out.println(sprite.isHealthy());
		System.out.println(cola.isHealthy());
		
		
		
		System.out.println(sprite);
		System.out.println(cola);
		System.out.println(curd);
		System.out.println(milk);

	}

}
