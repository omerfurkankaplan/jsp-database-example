/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ömer
 */
public class db {
  public static Connection connection; 
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct","root","");
			return connection; 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return null; 
	}
	
	public static void main(String[] args) {
		getConnection(); 
	}
}