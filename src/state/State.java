package state;

/*
 * 创建一个State接口，所有的状态都必须实现这个接口。
 * 在这个状态中定义了所有状态中可能发生的动作
 * */
public interface State {
	void injectQuater();
	void ejectQuater();
	void turnCrank();
	void dispense();
}
