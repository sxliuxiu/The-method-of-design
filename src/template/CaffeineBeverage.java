package template;

public abstract class CaffeineBeverage {
	//��Ϊ���ǲ�ϣ�����า�����������������������Ϊfinal
	final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	//��Ϊ������������������ľ���ʵ�ֲ�ͬ�����Խ���������������Ϊabstract���������Լ�ȥʵ��
	abstract void brew();
	abstract void addCondiments();
	
	void boilWater(){
		System.out.println("Boiling water");
	}
	void pourInCup(){
		System.out.println("Pouring into cup");
	}
}
