package observe;

import java.util.ArrayList;
import java.util.List;

public class TeacherSubject implements Subject {

	//用来存放和记录观察者
	private List<Observe> observes = new ArrayList<>();
	//记录状态的字符串
	private String info;
	
	public void notifyObserver() {
		for (int i = 0; i < observes.size();i++) {
			Observe observe = (Observe)observes.get(i);
			observe.update(info);
		}
	}

	
	public void addObserver(Observe obj) {	
		observes.add(obj);
	}

	
	public void deleteObserver(Observe obj) {
		int i = observes.indexOf(obj);
		if (i>=0) {
			observes.remove(obj);
		}
	}
	//布置作业的方法，在方法最后，需要调用notifyObserver()方法，通知所有观察者更新状态
	public void setHomework(String info) {
		this.info = info;
		System.out.println("今天的作业是"+info);
		this.notifyObserver();
	}

}
