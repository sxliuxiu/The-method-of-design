package state;

/*
 * ����һ��State�ӿڣ����е�״̬������ʵ������ӿڡ�
 * �����״̬�ж���������״̬�п��ܷ����Ķ���
 * */
public interface State {
	void injectQuater();
	void ejectQuater();
	void turnCrank();
	void dispense();
}
