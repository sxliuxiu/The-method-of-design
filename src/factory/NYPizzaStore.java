package factory;

public class NYPizzaStore extends PizzaStore {
//����ഴ��NY�������е�Pizza
	protected Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return  new NYStyleCheesePizza();
		}else {
			return null;
		}
		
	}

}
