package com.fengxiang.listdemo.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * 享元模式：对象的共享，即共享池，当系统对象多的时候可以减少系统的开销
 * 
 * @author fengxiang
 *
 */
public class ConnectionPools {

	private Vector<Connection> pools;

	/**
	 * 公有属性
	 */
	private String url = "jdbc:mysql://localhost:3306/test";
	private String username = "root";
	private String userpwd = "root";
	private String driverClassName = "com.mysql.jdbc.Driver";

	private int poosize = 100;
	private Connection connection = null;
	private ConnectionPools instance = null;

	/**
	 * 构造器初始化一些操作
	 */
	private ConnectionPools() {
		pools = new Vector<>(poosize);
		for (int i = 0; i < poosize; i++) {
			try {
				Class.forName(driverClassName);
				connection = DriverManager.getConnection(url, username, userpwd);
				pools.add(connection);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/* 返回连接到连接池 */
	public synchronized void release() {
		pools.add(connection);
	}

	/* 返回连接池中的一个数据库连接 */
	public synchronized Connection getConnection() {
		if (pools.size() > 0) {
			Connection conn = pools.get(0);
			pools.remove(conn);
			return conn;
		} else {
			return null;
		}
	}
}
