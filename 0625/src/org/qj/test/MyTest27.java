package org.qj.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyTest27 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytsetdb","username","password");
	}
	
}
