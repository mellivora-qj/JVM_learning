package org.qj.test;

class Parent{
	static int a = 3;
	static{
		System.out.println("Parent static block");
	}
}

class Child extends Parent{
	static int b = 3;
	static{
		System.out.println("Child static block");
	}
}

public class MyTest9 {

	static{
		System.out.println("MyTest static block");
	}
	
	public static void main(String[] args) {
		System.out.println(Child.b);
	}
}
