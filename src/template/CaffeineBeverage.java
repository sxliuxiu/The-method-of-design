package template;

public abstract class CaffeineBeverage {
	//因为我们不希望子类覆盖这个方法，所以我们声明为final
	final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	//因为子类对于这两个操作的具体实现不同，所以将这两个方法声明为abstract，由子类自己去实现
	abstract void brew();
	abstract void addCondiments();
	
	void boilWater(){
		System.out.println("Boiling water");
	}
	void pourInCup(){
		System.out.println("Pouring into cup");
	}
}
