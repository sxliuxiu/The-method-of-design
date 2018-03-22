package state;
/*
 * �����û��Ǯ��״̬�࣬��û��Ǯ��״̬�£�������ִ����Щ������
 * */
public class NoQuaterState implements State {

	GumballMachine gunballMachine;
	
	public NoQuaterState(GumballMachine gunballMachine) {
		this.gunballMachine = gunballMachine;
	}


	public void injectQuater() {
		System.out.println("You inserted a quarter");
		gunballMachine.setState(gunballMachine.getHasQuarterState());
	}

	
	public void ejectQuater() {
		System.out.println("You haven't inserted a quarter");
	}

	
	public void turnCrank() {
		System.out.println("You turned,but there's no quarter");
	}

	
	public void dispense() {
		System.out.println("You need to pay first");
	}

}
