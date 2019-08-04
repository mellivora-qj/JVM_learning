package org.qj.test;

import sun.misc.Launcher;

/*
 * �������ڣ�һ��Java�����ɸ������ȫ�޶���(binary name,��������)�����ڼ��ظ���Ķ����������(defining loader)����ͬ�����ġ�
 * ���ͬ������(����ͬ����ȫ�޶���)��������������ͬ�ļ����������أ���ô��Щ����ǲ�ͬ�ģ���ʹ.class���ֽ�����ȫһ�������Ҵ�
 * ��ͬ��λ�ü��ء�
 */

 /*
 * ��Oracle��HotSpotʵ���У�ϵͳ����sun.boot.class.path����Ĵ��ˣ������л������ʾObject���Ҳ����Ĵ���
 */
public class MyTest23 {

	public static void main(String[] args) {
		System.out.println(System.getProperty("sun.boot.class.path"));
		System.out.println(System.getProperty("java.ext.dirs"));
		System.out.println(System.getProperty("java.class.path"));
		
		/*
		 * �ڽ���JVM�е������������java.lang.ClassLoader�Լ�������Javaƽ̨�࣬
		 * ��JVM����ʱ��һ������Ļ���������У����������չ���������ϵͳ���������
		 * �������Ļ�������������������(Bootstrap)��
		 * 
		 * �����������������Java�࣬�������ļ���������Java�ࡣ
		 * ��������������ض���ƽ̨�Ļ���ָ��������������ļ��ع��̡�
		 * 
		 * ����������������������������������ʵ��ΪJava�ࡣ�������ܹ�Ҫ��һ����������ص�һ��Java���������
		 * �Ӷ����������ع���˳��������ȥ�����ص�һ����Java������������������������ְ��
		 * 
		 * ��������������Ḻ����ع�JRE������������Ҫ�Ļ������������java.Util��java.lang���е���ȡ�
		 */
		
		System.out.println(ClassLoader.class.getClassLoader());
		
		//��չ���������ϵͳ�������Ҳ��������������������ص�
		System.out.println(Launcher.class.getClassLoader());
		
		System.out.println("---------------------------------");
		
		System.out.println(System.getProperty("java.system.class.loader"));
		
		System.out.println(MyTest23.class.getClassLoader());
		
		System.out.println(MyTest16.class.getClassLoader());
		
		System.out.println(ClassLoader.getSystemClassLoader());
	}
	
}
