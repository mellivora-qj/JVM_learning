package org.qj.test;

class CL{
	 static{
		 System.out.println("Class CL");
	 }
}

//调用ClassLoader类的loadClass方法加载一个类，并不是对类的主动使用，不会导致类的初始化
//反射一个类时，是对类的主动使用，会导致类的初始化
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
