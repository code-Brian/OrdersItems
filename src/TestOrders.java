import java.util.ArrayList;

public class TestOrders {

	public static void main(String[] args) {
		// Menu items
		Item cake = new Item();
		cake.name = "cake";
		cake.price = 0.69;
		
		Item coffee = new Item();
		coffee.name = "coffee";
		coffee.price = 0.42;
		
		// Order variables -- order1, order2, etc.
		Order order1 = new Order();
		order1.name = "Jerry Smith";
		order1.items.add(coffee);
		order1.items.add(cake);
		order1.ready = true;
		
		// Application sims
		// Use this example code to test various orders' updates
		System.out.println("This order is for: " + order1.name);
		System.out.println("Order1 variable by itself... " + order1);
		System.out.println("Order1 ready status: " + order1.ready);
		System.out.println("Order1 items: " + order1.items);
	}

}
