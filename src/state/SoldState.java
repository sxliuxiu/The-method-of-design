package state;

/*
 * 这个是售卖状态类。在这个状态中面对不同的方法，会有不同的处理手段。
 * */
public class SoldState implements State {

	GumballMachine gumballMachine;
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	//在售卖阶段下边的三个方法都是不恰当的动作
	public void injectQuater() {
		System.out.println("Please wait,we're already giving you an gumball");
	}

	
	public void ejectQuater() {
		System.out.println("Sorry,you already turned the crank");
	}

	
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}

	//而这个动作才是售卖阶段最主要的动作。因为现在是售卖阶段，说明客户已经付款。所以我们要开始发放糖果。
	public void dispense() {
		//发放糖果
		gumballMachine.releaseBall();
		//如果还有糖果剩余,则将机器的状态设置为等待投钱状态
		if (gumballMachine.getCount()>0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}else {
			//否则状态转换的到糖果售罄状态
			System.out.println("Oops,out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
