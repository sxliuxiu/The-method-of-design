package state;

public class GumballMachine {

	//��������������״̬
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	//��״̬����ֵ
	State state = soldOutState;
	int count = 0;
	//�ڹ��캯���г�ʼ������״̬����ʾ��һ�������Ĳ�ͬ״̬
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuaterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		//��ʼ���������ǹ�������
		this.count = numberGumballs;
		if (numberGumballs>0) {
			//����ǹ���������0����״̬����Ϊû��Ǯ״̬
			state = noQuarterState;
		}
	}
	
	//��ͬ��״̬������Ӧ�ķ���
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
	//ʵ�ֲ�ͬ״̬֮���ת��
	void setState(State state){
		this.state = state;
	}
	//�ṩһ�������ǹ��ķ���
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
