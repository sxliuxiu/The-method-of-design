package state;

public class GumballMachine {

	//在类中声明所有状态
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	//将状态赋初值
	State state = soldOutState;
	int count = 0;
	//在构造函数中初始化所有状态，表示是一个机器的不同状态
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuaterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		//初始化机器中糖果的数量
		this.count = numberGumballs;
		if (numberGumballs>0) {
			//如果糖果数量大于0，将状态设置为没有钱状态
			state = noQuarterState;
		}
	}
	
	//不同的状态调用相应的方法
	public void insertQuarter(){
		state.injectQuater();
	}
	public void ejectQuarter(){
		state.ejectQuater();
	}
	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}
	//实现不同状态之间的转换
	void setState(State state){
		this.state = state;
	}
	//提供一个发放糖果的方法
	void releaseBall(){
		System.out.println("A gumball comes rolling out the slot ...");
		if (count !=0) {
			count = count - 1;
		}
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public void setHasQUarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public int getCount() {
		return count;
	}

	public State getWinnerState() {
		return winnerState;
	}
	
	
	
}
