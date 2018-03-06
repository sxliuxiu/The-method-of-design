package observe;

public class StudentObserve implements Observe{

	//保存一个Subject的引用，以后如果想取消订阅，有了这个引用会比较方便
	private TeacherSubject teacherSubject;
	//学生的姓名,用来标识不同的学生对象
	private String name;
	//构造器用来注册观察者
	public StudentObserve(String name,TeacherSubject teacherSubject) {
		this.name = name;
		this.teacherSubject = teacherSubject;
		
		//每新建一个学生对象，默认添加到观察者的行列
		teacherSubject.addObserver(this);
	}
	public void update(String info) {
		System.out.println(name+"得到的作业:"+info);
	}

}
