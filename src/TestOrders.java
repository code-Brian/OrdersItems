import java.util.ArrayList;

public class TestOrders {

	public static void main(String[] args) {
		Item order1 = new Item();
		// Menu items
		
		// Order variables -- order1, order2, etc.
		order1.name = "Poop";
		order1.total= 55;
		order1.ready = true;
		
		// Application sims
		// Use this example code to test various orders' updates
		System.out.println("Name: %s\n", order1.name);
		System.out.println("Total: %s\n", order1.total);
		System.out.println("Ready: %s\n", order1.ready);
	}

}
