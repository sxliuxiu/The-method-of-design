package factory;

public class NYStyleCheesePizza extends Pizza {
	//������ʽ�ĸ��ݲ�ͬ�ط���ζ��pizza
	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}
}
