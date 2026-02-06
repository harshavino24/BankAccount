package com.wipro.bank.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBUtil {
public static Connection getDBConnection() {
	
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="harshavino";
	String pass="harsha123";
	Connection connection=DriverManager.getConnection(url,user,pass);
	return connection;
	}catch(ClassNotFoundException|SQLException e) {
		System.out.println("Oracle JDBC Driver Not Found");
		System.out.println(e);
		return null;
	}
			
}
}