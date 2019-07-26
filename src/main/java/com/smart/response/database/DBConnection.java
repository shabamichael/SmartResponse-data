/**
 * 
 */
package com.smart.response.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author michael
 *
 */
public class DBConnection {

	/**
	 * 
	 */
	Connection con = null;
	
	public DBConnection() {
		
String url="jdbc:mysql://localhost:3306/smart_response_api?autoReconnect=true&";
String user="root";
String password="root";
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Successful Loaded driver");
			con= DriverManager.getConnection(url, user, password);
			System.out.println("Successful Connected to mysql");
		}
		catch(Exception e) {
			System.out.println("What happened");
			System.out.println(e);
		}
		
	}

}
