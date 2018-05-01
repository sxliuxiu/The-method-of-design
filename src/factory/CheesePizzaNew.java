package factory;

public class CheesePizzaNew extends PizzaNew {
	PizzaIngredientFactory ingredientFactory;
	public CheesePizzaNew(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	void prepare() {
		System.out.println("Preparing"+name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}

}
