package org.qj.test;

public class MyTest15 {

	public static void main(String[] args) {
		String[] string = new String[2];
		System.out.println(string.getClass().getClassLoader());//����(��)�������
		System.out.println("--------------------");
		
		MyTest15[] myTest15 = new MyTest15[2];
		System.out.println(myTest15.getClass().getClassLoader());
		System.out.println("--------------------");
		
		int[] ints = new int[2];
		System.out.println(ints.getClass().getClassLoader());//û��classloader
	}
	
}
