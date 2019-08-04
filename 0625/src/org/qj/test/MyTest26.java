package org.qj.test;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

/*
 * �߳�ɽ�������������һ��ʹ��ģʽ����ȡ - ʹ�� - ��ԭ��
 * 
 * ClassLoader classLoader = Thread.currnetThread().getContextClassLoader();
 * 
 * try{
 * 	Thread.currentThread().setContextClassLoader(targetTccl);
 * 	myMethod();
 * } finally {
 * 	Thread.currentThread().setContextClassLoader(classLoader);
 * }
 * 
 * myMethod�����������Thread.currnetThread().getContextClassLoader()����ȡ��ǰ�̵߳����������������ĳЩ���顣
 * 
 * ���һ�������������A���أ���ô������������Ҳ������Ӧ������������ص�(�����������֮ǰû�б����ع��Ļ�)��
 * 
 * ContextClassLoader�����þ���Ϊ���ƻ�Java�������ί�л��ơ�
 * 
 * ���߲��ṩ��ͳһ�Ľӿ��õײ�ʵ�֣�ͬʱ��Ҫ�ڸ߲����(��ʵ����)�ײ���ʱ���ͱ���Ҫͨ���߳���������������������߲��ClassLoader
 * �ҵ������ظ��ࡣ
 *  
 */

public class MyTest26 {
	
	public static void main(String[] args) {
		
		ServiceLoader<Driver> loader = ServiceLoader.load(Driver.class);
		Iterator<Driver> iterator = loader.iterator();
		
		while(iterator.hasNext()){
			Driver driver = iterator.next();
			
			System.out.println("driver: " + driver.getClass() + ",loader: " + driver.getClass().getClassLoader());
		}
		
		System.out.println("��ǰ�߳���������������� " + Thread.currentThread().getContextClassLoader());
		System.out.println("ServiceLoader����������� " + ServiceLoader.class.getClassLoader());
		
	}

}
