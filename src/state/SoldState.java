package state;

/*
 * ���������״̬�ࡣ�����״̬����Բ�ͬ�ķ��������в�ͬ�Ĵ����ֶΡ�
 * */
public class SoldState implements State {

	GumballMachine gumballMachine;
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	//�������׶��±ߵ������������ǲ�ǡ���Ķ���
	public void injectQuater() {
		System.out.println("Please wait,we're already giving you an gumball");
	}

	
	public void ejectQuater() {
		System.out.println("Sorry,you already turned the crank");
	}

	
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}

	//������������������׶�����Ҫ�Ķ�������Ϊ�����������׶Σ�˵���ͻ��Ѿ������������Ҫ��ʼ�����ǹ���
	public void dispense() {
		//�����ǹ�
		gumballMachine.releaseBall();
		//��������ǹ�ʣ��,�򽫻�����״̬����Ϊ�ȴ�ͶǮ״̬
		if (gumballMachine.getCount()>0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}else {
			//����״̬ת���ĵ��ǹ�����״̬
			System.out.println("Oops,out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
