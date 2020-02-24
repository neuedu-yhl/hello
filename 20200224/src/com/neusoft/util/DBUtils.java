package com.neusoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {
	
	

	// 封装获取连接的方法
	public static Connection getConnection() {
		Connection connection = null;
		// 1.加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 2.建立连接      Connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/personmanager?characterEncoding=utf-8", "root", "mysqladmin");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(null != connection) {
			return connection;
		}
		return null;
	} 
	
	
	// 封装关闭资源的方法
	public static void closeResource(ResultSet rs,PreparedStatement preparedStatement,Connection connection) {
		if(null != rs) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(null != preparedStatement) {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(null != connection) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}