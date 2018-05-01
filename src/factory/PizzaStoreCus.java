package factory;

public class PizzaStoreCus {
	SimplePizzaFactory factory;
	public PizzaStoreCus(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = factory.createPizza("");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
