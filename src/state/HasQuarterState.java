package state;

import java.util.Random;
/*
 * 这是有钱状态类
 * */
public class HasQuarterState implements State {

	Random randomWinner = new Random(System.currentTimeMillis());
	GumballMachine gumballMachine;
	//当状态被实例化的时候,我们要传入GumballMachine的引用作为参数
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	//这是一个不恰当的操作
	public void injectQuater() {
		System.out.println("You can't insert another quarter");
	}

	//退出顾客的25美分钱,并将状态转换为NoQuarterState
	public void ejectQuater() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	//这是最关键的一步操作。
	public void turnCrank() {
		System.out.println("You turned...");
		//当曲柄转动的时候，我们调用setState方法并传入SoldState售卖状态对象作为参数
		//将机器的状态转换为SoldState
		/*gumballMachine.setState(gumballMachine.getSoldState());*/
		//判断是否能转换到WinnerState，并且是10% 的概率称为获胜者
		int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		}else {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

	
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

}
