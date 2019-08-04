package org.qj.test;

class CL{
	 static{
		 System.out.println("Class CL");
	 }
}

//����ClassLoader���loadClass��������һ���࣬�����Ƕ��������ʹ�ã����ᵼ����ĳ�ʼ��
//����һ����ʱ���Ƕ��������ʹ�ã��ᵼ����ĳ�ʼ��
public class MyTest12 {

	public static void main(String[] args) throws Exception{
		
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		
		Class<?> clazz = loader.loadClass("org.qj.test.CL");
		
		System.out.println(clazz);
		System.out.println("------------------------");
		
		clazz = Class.forName("org.qj.test.CL");
		System.out.println(clazz);
	}
	
}
