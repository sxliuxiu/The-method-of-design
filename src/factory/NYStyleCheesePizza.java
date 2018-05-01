package factory;

public class NYStyleCheesePizza extends Pizza {
	//这是新式的根据不同地方口味的pizza
	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}
}
