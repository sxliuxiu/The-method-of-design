package factory;

public class PizzaNew {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	abstract void prepare();
	
	void bake(){
		System.out.println("Bake for 25 minutes at 350");
	}
	void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	void box(){
		System.out.println("Place pizza in offical PizzaStore box");
	}
	void setName(String name){
		this.name = name;
	}
	String getName(){
		return name;
	}
	public String toString(){
		//这里是打印比萨的代码
	}
}
