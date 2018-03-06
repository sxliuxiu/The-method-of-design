package observe;

public class TestObserve {

	public static void main(String[] args) {
		TeacherSubject teacher = new TeacherSubject();
		
		StudentObserve student1 = new StudentObserve("张三", teacher);
		StudentObserve student2 = new StudentObserve("李四", teacher);
		StudentObserve student3 = new StudentObserve("王五", teacher);
		
		teacher.setHomework("第二页第六题");
		teacher.setHomework("第三页第七题");
		teacher.setHomework("第四页第八题");
	}

}
