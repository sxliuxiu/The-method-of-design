package state;

import java.util.Random;
/*
 * ������Ǯ״̬��
 * */
public class HasQuarterState implements State {

	Random randomWinner = new Random(System.currentTimeMillis());
	GumballMachine gumballMachine;
	//��״̬��ʵ������ʱ��,����Ҫ����GumballMachine��������Ϊ����
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	//����һ����ǡ���Ĳ���
	public void injectQuater() {
		System.out.println("You can't insert another quarter");
	}

	//�˳��˿͵�25����Ǯ,����״̬ת��ΪNoQuarterState
	public void ejectQuater() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	//������ؼ���һ��������
	public void turnCrank() {
		System.out.println("You turned...");
		//������ת����ʱ�����ǵ���setState����������SoldState����״̬������Ϊ����
		//��������״̬ת��ΪSoldState
		/*gumballMachine.setState(gumballMachine.getSoldState());*/
		//�ж��Ƿ���ת����WinnerState��������10% �ĸ��ʳ�Ϊ��ʤ��
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
