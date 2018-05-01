package factory;

public class NYPizzaStore extends PizzaStore {
//这个类创建NY地区特有的Pizza
	protected Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return  new NYStyleCheesePizza();
		}else {
			return null;
		}
		
	}

}
