package org.qj.test;

public class MyTest22 {
	
	static{
		System.out.println("MyTest22 initializer");
	}
	
	public static void main(String[] args) {
		System.out.println(MyTest22.class.getClassLoader());
		
		System.out.println(MyTest8.class.getClassLoader());
	}

}
