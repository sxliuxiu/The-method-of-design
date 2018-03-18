package template;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	
	void brew() {
		System.out.println("Dripping Coffee through filter");
	}
	void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
	//覆盖了钩子，提供自己的功能
	public boolean customerWantsCondiments(){
		String answer = getUserInfo();
		
		if (answer.toLowerCase().startsWith("y")) {
			return true;
		}else
			return false;
	}
	private String getUserInfo() {
		String answer = null;
		System.out.println("Would you like milk and sugar with your coffee(y/n)?");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (Exception e) {
			System.out.println("IO error");
		}
		if (answer == null) {
			return "no";
		}
		return answer;
	}
}
