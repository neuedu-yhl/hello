package com.neusoft.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDemo {
	
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		try {
			// 1.加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 2.建立连接      Connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/personmanager?", "root", "mysqladmin");
			// 3.声明sql语句
			String str = "select * from boys";
			// 4.编译sql语句
			prepareStatement = connection.prepareStatement(str);
			// 5.执行sql语句
			resultSet = prepareStatement.executeQuery();
			// 6.取出结果
			while(resultSet.next()) {
				// 拿到一条记录
				int id = resultSet.getInt("id");
				String boyName = resultSet.getString("boyName");
				int cp = resultSet.getInt("userCP");
				System.out.print(id);
				System.out.print(boyName);
				System.out.print(cp);
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				prepareStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}