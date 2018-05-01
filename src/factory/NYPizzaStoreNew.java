package factory;

public class NYPizzaStoreNew extends PizzaStore {

	
	protected Pizza createPizza(String type) {
		PizzaNew pizzaNew = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if (type.equals("cheese")) {
			pizzaNew = new CheesePizzaNew(ingredientFactory);
			pizzaNew.setName("New York Style Cheese Pizza");
		}
		return pizzaNew;
	}

}
