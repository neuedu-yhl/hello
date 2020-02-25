package com.neusoft.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.neusoft.entity.User;
import com.neusoft.util.DBUtils;

/**
 * 用户dao层实现类
 * @author Neuedu
 * @Date 2020/02/24
 */
public class UserDaoImpl implements UserDao {

	@Override
	public int addOneUser(User user) {
		Connection connection = DBUtils.getConnection();
		String sql = "INSERT INTO user(username,password,regdate) VALUES (?,?,NOW())";
		PreparedStatement prepareStatement = null;
		try {
			//  预编译sql语句
		   prepareStatement = connection.prepareStatement(sql);
		    // 给占位符赋值
		   prepareStatement.setString(1, user.getUserName());
		   prepareStatement.setString(2, user.getPassWord());
		    // 执行sql
		   int executeUpdate = prepareStatement.executeUpdate();
		   return executeUpdate;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeResource(null, prepareStatement, connection);
		}
		return 0;
	}

	@Override
	public boolean checkUserIsExists(User user) {
		Connection connection = DBUtils.getConnection();
		String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
		PreparedStatement prepareStatement = null;
		try {
			//  预编译sql语句
		   prepareStatement = connection.prepareStatement(sql);
		    // 给占位符赋值
		   prepareStatement.setString(1, user.getUserName());
		   prepareStatement.setString(2, user.getPassWord());
		    // 执行sql
		   ResultSet rs = prepareStatement.executeQuery();
		   // 输出结果集
		   System.out.println("结果集:"+rs);
		   if(rs.next()) {
			   return true;
		   }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeResource(null, prepareStatement, connection);
		}
		return false;
	}
}