package org.qj.test;

/*
 * ���������ռ����Ҫ˵��
 * 
 * 1���Ӽ����������ص��࣬�ܹ����ʸ������������ص��ࡣ
 * 2�����������������ص��࣬�޷����ʵ��Ӽ����������ص��ࡣ
 */
public class MyTest17_1 {
	
	public static void main(String[] args) throws Exception {
		MyTest16 loader1 = new MyTest16("loader1");
		loader1.setPath("C:/Users/quanj/Desktop/java/");
		Class<?> clazz = loader1.loadClass("org.qj.test.MySample");
		System.out.println("class " + clazz.hashCode());
		
		//���ȥ�����У���ô������ʵ����MySample���󣬼�MySample���췽�����ᱻ����
		//��˲���ʵ����MyCat���󣬼�û�ж�MyCat��������ʹ�ã����ﲻ�����MyCat class
		Object object = clazz.newInstance();
	}
}
