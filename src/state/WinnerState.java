package state;

/*
 * 这个是赢者状态
 * */
public class WinnerState implements State {

	GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}


	public void injectQuater() {
		System.out.println("Please wait,we're already giving you an gumball");
	}

	
	public void ejectQuater() {
		System.out.println("Sorry,you already turned the crank");
	}

	
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}

	
	public void dispense() {
		System.out.println("You are a winner!You get two gumballs for your quarter");
		//赢者直接发放一个糖果
		gumballMachine.releaseBall();
		//如果糖果数为0,则将状态转换为售罄状态
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}else {
			//否则继续发放一个糖果
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() > 0 ) {
				//如果糖果数还是大于0，则将状态转换为请投币状态
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			}else {
				System.out.println("Oops,out of gumballs!");
				//否则就是售罄状态
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}
}
