package org.qj.test;

/*
 * 关于命名空间的重要说明
 * 
 * 1、子加载器所加载的类，能够访问父加载器所记载的类。
 * 2、而父加载器所加载的类，无法访问到子加载器所加载的类。
 */
public class MyTest17_1 {
	
	public static void main(String[] args) throws Exception {
		MyTest16 loader1 = new MyTest16("loader1");
		loader1.setPath("C:/Users/quanj/Desktop/java/");
		Class<?> clazz = loader1.loadClass("org.qj.test.MySample");
		System.out.println("class " + clazz.hashCode());
		
		//如果去掉该行，那么并不会实例化MySample对象，即MySample构造方法不会被调用
		//因此不会实例化MyCat对象，即没有对MyCat对象主动使用，这里不会加载MyCat class
		Object object = clazz.newInstance();
	}
}
