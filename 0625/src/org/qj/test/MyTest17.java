package org.qj.test;

public class MyTest17 {

	public static void main(String[] args) throws Exception {
		MyTest16 loader1 = new MyTest16("loader1");
		
		Class<?> clazz = loader1.loadClass("org.qj.test.MySample");
		System.out.println("class " + clazz.hashCode());
		
		//���ȥ�����У���ô������ʵ����MySample���󣬼�MySample���췽�����ᱻ����
		//��˲���ʵ����MyCat���󣬼�û�ж�MyCat��������ʹ�ã����ﲻ�����MyCat class
		//Object object = clazz.newInstance();
	}
	
}
