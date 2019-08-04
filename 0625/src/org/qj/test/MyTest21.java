package org.qj.test;

import java.lang.reflect.Method;

/*
 * ���������˫��ί�л��Ƶĺô���
 * 
 * 1������ȷ��Java���Ŀ����İ�ȫ�����е�JavaӦ�ö����ٻ�����java.lang.Object�࣬Ҳ����˵�������ڣ�
 * 		java.lang.Object�����ᱻ���ص�Java������У����������ع�������JavaӦ���Լ��������������ɵģ�
 * 		��ô�ܿ��ܾͻ���JVM�д��ڶ���汾��java.lang.Object�࣬������Щ��֮���ǲ����ݵģ��໥���ɼ���(���������ռ��ڷ���������)��
 * 		������˫��ί�л��ƣ�Java��������е���ļ��ع��������ɸ����������ͳһ��ɣ��Ӷ�ȷ����JavaӦ����ʹ�õĶ���ͬһ���汾��
 * 		Java������⣬����֮�����໥���ݵġ�
 * 2������ȷ��Java����������ṩ���಻�ᱻ�Զ�������������
 * 3����ͬ�������������Ϊ��ͬ����(binary name)���ഴ������������ռ䡣��ͬ���Ƶ�����Բ�����Java������У�ֻ��Ҫ�ò�ͬ������������ؼ��ɡ�
 * 		��ͬ���������֮����ص���֮���ǲ����ݵġ�����൱����Java��������ڲ�������һ����һ���໥�����Java��ռ䣬
 * 		���༼���ڶ����ж��õ���ʵ��Ӧ�á�
 * 
 */
public class MyTest21 {
	
	public static void main(String[] args) throws Exception {
		MyTest16 loader1 = new MyTest16("loader1");
		loader1.setPath("C:/Users/quanj/Desktop/java/");
		MyTest16 loader2 = new MyTest16("loader2");
		loader2.setPath("C:/Users/quanj/Desktop/java/");
		
		Class<?> clazz1 = loader1.loadClass("org.qj.test.entity.MyPerson");
		Class<?> clazz2 = loader2.loadClass("org.qj.test.entity.MyPerson");
		
		System.out.println(clazz1 == clazz2);
		
		Object object1 = clazz1.newInstance();
		Object object2 = clazz2.newInstance();
		
		Method method = clazz1.getMethod("setMyPerson", Object.class);
		method.invoke(object1, object2);
	}

}
