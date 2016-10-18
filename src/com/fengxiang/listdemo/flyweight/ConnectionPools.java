package com.fengxiang.listdemo.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * ��Ԫģʽ������Ĺ���������أ���ϵͳ������ʱ����Լ���ϵͳ�Ŀ���
 * 
 * @author fengxiang
 *
 */
public class ConnectionPools {

	private Vector<Connection> pools;

	/**
	 * ��������
	 */
	private String url = "jdbc:mysql://localhost:3306/test";
	private String username = "root";
	private String userpwd = "root";
	private String driverClassName = "com.mysql.jdbc.Driver";

	private int poosize = 100;
	private Connection connection = null;
	private ConnectionPools instance = null;

	/**
	 * ��������ʼ��һЩ����
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

	/* �������ӵ����ӳ� */
	public synchronized void release() {
		pools.add(connection);
	}

	/* �������ӳ��е�һ�����ݿ����� */
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
