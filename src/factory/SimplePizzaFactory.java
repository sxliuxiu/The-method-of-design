package factory;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class SimplePizzaFactory {
	public Pizza createPizza(String type){
		Pizza pizza = null;
		if(type.equals("cheese")){
			pizza = new CheesePizza();
		}else if(type.equals("pepperoniPizza")){
			pizza = new PepperoniPizza();
		}else if (type.equals("clam")) {
			pizza = new ClamPizza();
		}
		return pizza;
		
	}
}
