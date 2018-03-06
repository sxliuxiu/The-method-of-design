package observe;
/*
 * 观察者模式定义了对象之间一对多的依赖关系，当“一”的状态发生变化时，依赖它的“多”的一方会收到通知并且自动更新。
 * */

public interface Subject {

	//添加观察者
	void addObserver(Observe obj);
	//移除观察者
	void deleteObserver(Observe obj);
	//当主题方法改变时,这个方法被调用，通知所有的观察者
	void notifyObserver();
}
