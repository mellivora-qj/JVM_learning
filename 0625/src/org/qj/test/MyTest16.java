package org.qj.test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class MyTest16 extends ClassLoader{

	private String  classLoaderName = "";
	
	private String path;
	
	private final String filExtension = ".class";
	
	public void setPath(String path) {
		this.path = path;
	}

	public MyTest16(String classLoaderName){
		super();//将系统类加载器当作该类加载器的父加载器
		this.classLoaderName = classLoaderName;
	}
	
	public MyTest16(ClassLoader parent,String classLoaderName){
		super(parent);//显示指定该类加载器的父加载器
		this.classLoaderName = classLoaderName;
	}
	
	public MyTest16(ClassLoader parent){
		super(parent);
	}

	@Override
	public String toString() {
		return "MyTest16 [classLoaderName=" + classLoaderName + ", filExtension=" + filExtension + "]";
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {

		System.out.println("findClass invoked:" + name);
		System.out.println("class loader name:" + this.classLoaderName);
		
		byte[] data = this.loadClassData(name);
		
		return this.defineClass(name, data, 0, data.length);
	}
	
	private byte[] loadClassData(String name){
		
		InputStream is = null;
		byte[] data= null;
		ByteArrayOutputStream baos = null;

		name = name.replace(".", "\\");
		try {
			
			is = new FileInputStream(new File(this.path + name + this.filExtension));
			baos = new ByteArrayOutputStream();
			
			int ch = 0;
			while(-1 != (ch=is.read())){
				baos.write(ch);
			}
			
			data = baos.toByteArray();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally{
			try {
				is.close();
				baos.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return data;
	}
	
	public static void main(String[] args) throws Exception {
		MyTest16 loader1 = new MyTest16("loader1");
		loader1.setPath("C:/Users/quanj/Desktop/java/");
		Class<?> clazz = loader1.loadClass("org.qj.test.MyTest8");
		System.out.println("class:" + clazz.hashCode());
		Object object = clazz.newInstance();
		System.out.println(object);
		
		System.out.println("----------------------");
		
		loader1 = null;
		clazz = null;
		object = null;
		
		System.gc();
		
		Thread.sleep(100000);
		
		System.out.println("----------------------");
		
		loader1 = new MyTest16("loader1");
		loader1.setPath("C:/Users/quanj/Desktop/java/");
		clazz = loader1.loadClass("org.qj.test.MyTest8");
		System.out.println("class:" + clazz.hashCode());
		object = clazz.newInstance();
		System.out.println(object);
		
		System.out.println("----------------------");
//
////		MyTest16 loader2 = new MyTest16("loader2");
//		//loader1 做为loader2的父类 先去loader1加载器的命名空间中寻找。  因为存在有类，就不再加载了
//		MyTest16 loader2 = new MyTest16(loader1,"loader2");
//		loader2.setPath("C:/Users/quanj/Desktop/java/");
//		Class<?> clazz2 = loader2.loadClass("org.qj.test.MyTest8");
//		System.out.println("class:" + clazz2.hashCode());
//		Object object2 = clazz2.newInstance();
//		System.out.println(object2);
//		
//		System.out.println("----------------------");
//		
//		MyTest16 loader3 = new MyTest16(loader2,"loader3");
//		loader3.setPath("C:/Users/quanj/Desktop/java/");
//		Class<?> clazz3 = loader3.loadClass("org.qj.test.MyTest8");
//		System.out.println("class:" + clazz3.hashCode());
//		Object object3 = clazz3.newInstance();
//		System.out.println(object3);
//		
//		System.out.println("----------------------");
		
	}
}
