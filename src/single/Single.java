package single;

//建议原则:定义单例，建议使用饿汉式

/*
 * 想要保证对象唯一:
 * 1.为了避免其他程序过多建立该类对象，先禁止其他程序建立该类对象
 * 2.还为了让其他程序可以访问到该类对象，只好在本类中，自定义一个对象。
 * 3.为了方便其他程序对自定义对象的访问，可以对外提供一些访问方式。
 * 
 * 这三步都怎么用代码体现？
 * 1.将构造函数私有化
 * 2.在类中创建一个本类对象
 * 3.提供一个方法可以获取到该对象
 * 
 * 当需要将该事物的对象保证在内存中唯一时，就将以上的三步加上即可。
 * */
/*
 * 这个是先初始化对象
 * 称为：饿汉式
 * 开发的时候一般都用饿汉式，简单、安全
 * */
/*public class Single {

	private static Single s = new Single();
	private Single(){}
	public static Single getInstance(){
		return s;
	}
}*/

//对象是方法调用时，才初始化，也叫做对象的延时加载。称为:懒汉式。
//如果多个人同时调用懒汉式会出现问题
//Single类进内存时，对象还没有存在，只有调用了getInstance的方法时，才建立对象。
/*public class Single{
	private static Single s = null;
	private Single(){}
	public static Single getInstance() {
		if (s == null) {
			s = new Single();
		}
		return s;
	}
}*/
public class Single{
	private static Single s = null;
	private Single(){}
	/*public static synchronized single getInstance()*/
	public static Single getInstance() {
		if (s == null) {
			synchronized (Single.class) {
				if (s==null) {
					s = new Single();
				}
			}
		}
		return s;
	}
}