package single;

//����ԭ��:���嵥��������ʹ�ö���ʽ

/*
 * ��Ҫ��֤����Ψһ:
 * 1.Ϊ�˱�������������ཨ����������Ƚ�ֹ�����������������
 * 2.��Ϊ��������������Է��ʵ��������ֻ���ڱ����У��Զ���һ������
 * 3.Ϊ�˷�������������Զ������ķ��ʣ����Զ����ṩһЩ���ʷ�ʽ��
 * 
 * ����������ô�ô������֣�
 * 1.�����캯��˽�л�
 * 2.�����д���һ���������
 * 3.�ṩһ���������Ի�ȡ���ö���
 * 
 * ����Ҫ��������Ķ���֤���ڴ���Ψһʱ���ͽ����ϵ��������ϼ��ɡ�
 * */
/*
 * ������ȳ�ʼ������
 * ��Ϊ������ʽ
 * ������ʱ��һ�㶼�ö���ʽ���򵥡���ȫ
 * */
/*public class Single {

	private static Single s = new Single();
	private Single(){}
	public static Single getInstance(){
		return s;
	}
}*/

//�����Ƿ�������ʱ���ų�ʼ����Ҳ�����������ʱ���ء���Ϊ:����ʽ��
//��������ͬʱ��������ʽ���������
//Single����ڴ�ʱ������û�д��ڣ�ֻ�е�����getInstance�ķ���ʱ���Ž�������
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