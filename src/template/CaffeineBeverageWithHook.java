package template;

import sun.security.provider.VerificationProvider;

public abstract class CaffeineBeverageWithHook {
	void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
	abstract void brew();
	abstract void addCondiments();
	
	void boilWater(){
		System.out.println("Boiling water");
	}
	void pourInCup(){
		System.out.println("Pouring into cup");
	}
	//������һ�ֱ������ڳ������еķ���,��ֻ�пյĻ���Ĭ�ϵ�ʵ�֡�
	//���ӵĴ���,�������������������㷨�Ĳ�ͬ����йҹ���Ҫ��Ҫ�ҹ�,�������Լ�����
	//����һ������,������Ը����������,��������һ��Ҫ��ô����
	boolean customerWantsCondiments(){
		return true;
	}
}
