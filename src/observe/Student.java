package observe;

import java.util.Observable;
import java.util.Observer;

public class Student implements Observer {

	private Observable observable;
	private String name;

	public Student(String name,Observable observable) {
		this.observable = observable;
		this.name = name;
		
		observable.addObserver(this);
	}

	public void update(Observable o, Object arg) {
		Teacher teacher = (Teacher) o;
		System.out.println(name+"得到作业信息:"+teacher.getInfo());
	}

}
