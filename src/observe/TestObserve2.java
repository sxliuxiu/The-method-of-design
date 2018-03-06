package observe;

public class TestObserve2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher();
		
		Student student1 = new Student("张三", teacher);
		Student student2 = new Student("李四", teacher);
		Student student3 = new Student("王五", teacher);
		
		teacher.setHomework("今天作业是第二章第三页");
		teacher.setHomework("今天作业是第三章第四页");
		teacher.setHomework("今天作业是第四章第五页");
		
		
	}

}
