package state;

/*
 * �����Ӯ��״̬
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
		//Ӯ��ֱ�ӷ���һ���ǹ�
		gumballMachine.releaseBall();
		//����ǹ���Ϊ0,��״̬ת��Ϊ����״̬
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}else {
			//�����������һ���ǹ�
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() > 0 ) {
				//����ǹ������Ǵ���0����״̬ת��Ϊ��Ͷ��״̬
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			}else {
				System.out.println("Oops,out of gumballs!");
				//�����������״̬
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}
}
