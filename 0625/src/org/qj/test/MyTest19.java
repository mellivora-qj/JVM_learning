package org.qj.test;

import com.sun.crypto.provider.*;

public class MyTest19 {

	public static void main(String[] args) {
		AESKeyGenerator ec = new AESKeyGenerator();
		
		System.out.println(ec.getClass().getClassLoader());
		System.out.println(MyTest19.class.getClassLoader());
	}
	
}
