package org.qj.test;

// 启动类加载器  --> 扩展类加载器 --> 系统类加载器 --> 自定义加载器
public class MyTest18_1 {
	
	public static void main(String[] args) throws Exception {
		MyTest16 loader1 = new MyTest16("loader1");
		loader1.setPath("C:/Users/quanj/Desktop/java/");
		
		Class<?> clazz = loader1.loadClass("org.qj.test.MyTest8");
		System.out.println("class :" + clazz.hashCode());
		System.out.println("class loader :" + clazz.getClassLoader());
	}

}
