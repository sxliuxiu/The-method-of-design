package factory;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.createPizza("cheese");
		System.out.println(pizza.getName());
		
		Pizza pizza2 = chicagoStore.createPizza("cheese");
		System.out.println(pizza2.getName());
	}

}
