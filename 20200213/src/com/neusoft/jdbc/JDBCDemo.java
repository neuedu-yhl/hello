package com.neusoft.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo {
	
	
	public static void main(String[] args) {
//		List<Boys> allBoys = new JDBCDemo().getAllBoys();
//		System.out.println(allBoys);
//		Connection connection = getConnection();
//		System.out.println(connection);
		Boys boys = new Boys(7,"谢霆锋",800);
		int addOneBoy = new JDBCDemo().deleteBoysInfo(7);
		System.out.println(addOneBoy);
	}
	
	
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
	
	
	public int deleteBoysInfo(int id) {
		Connection connection = getConnection();
		//编译sql语句
		PreparedStatement prepareStatement = null;
		int executeUpdate = 0;
		try {
			prepareStatement = connection.prepareStatement("DELETE FROM boys WHERE id = ?");
			prepareStatement.setInt(1, id);
			executeUpdate =  prepareStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResource(null, prepareStatement, connection);
		}
		return executeUpdate;
		
	}
	
	public int updateBoysInfo(Boys boys) {
		Connection connection = getConnection();
		//编译sql语句
		PreparedStatement prepareStatement = null;
		int executeUpdate = 0;
		try {
			prepareStatement = connection.prepareStatement("UPDATE boys SET boyName = ?,userCP = ? WHERE id = ?");
			prepareStatement.setString(1, boys.getBoyName());
			prepareStatement.setInt(2, boys.getUserCP());
			prepareStatement.setInt(3, boys.getId());
			executeUpdate =  prepareStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResource(null, prepareStatement, connection);
		}
		return executeUpdate;
	}

	public int addOneBoy(Boys boy) {
		Connection connection = getConnection();
		//编译sql语句
		PreparedStatement prepareStatement = null;
		int executeUpdate = 0;
		try {
			prepareStatement = connection.prepareStatement("INSERT INTO boys(boyName,userCP) VALUES (?,?)");
			prepareStatement.setString(1, boy.getBoyName());
			prepareStatement.setInt(2, boy.getUserCP());
			executeUpdate =  prepareStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResource(null, prepareStatement, connection);
		}
		return executeUpdate;
	}
	
	// 查询方法
	public List<Boys> getAllBoys(){
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		ArrayList<Boys> arrayList =  null;
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
			// 创建存放boy的一个集合
			arrayList = new ArrayList<Boys>();
			// 6.取出结果
			while(resultSet.next()) {
				// 拿到一条记录
				int id = resultSet.getInt("id");
				String boyName = resultSet.getString("boyName");
				int cp = resultSet.getInt("userCP");
				Boys boys = new Boys(id, boyName, cp);
				arrayList.add(boys);
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
		return arrayList;
	}
}