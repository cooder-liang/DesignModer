package com.fengxiang.listdemo.singleton;

/**
 * ����ģʽ
 * 
 * @author fengxiang
 *
 */
public class Singleton {

	// �˴�instance==null��Ϊ���ӳټ��ء�����
	public static Singleton instance = null;

	// ������˽�л�����ֹ��ʵ������
	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public Object readResoved() {
		return instance;
	}

	// =================�������ģʽĿǰ��������õ�=================
	public static Singleton instance1 = new Singleton();

	public static Singleton getInstance1() {
		return instance1;
	}

	// ================�̰߳�ȫ��=======================
	// �����Ҫע��һ�����⣬jvm�Զ���ĳ�ʼ���͸�ֵ�Ƿֿ������ģ����ܱ�֤�ĸ��Ⱥ󡣶��̵߳�ʱ�����׳����⡣
	public static Singleton getInstance2() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
