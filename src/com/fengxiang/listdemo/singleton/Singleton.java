package com.fengxiang.listdemo.singleton;

/**
 * 单利模式
 * 
 * @author fengxiang
 *
 */
public class Singleton {

	// 此处instance==null是为了延迟加载。。。
	public static Singleton instance = null;

	// 构造器私有化，防止被实例化。
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

	// =================这个单利模式目前是性能最好的=================
	public static Singleton instance1 = new Singleton();

	public static Singleton getInstance1() {
		return instance1;
	}

	// ================线程安全的=======================
	// 这边需要注意一个问题，jvm对对象的初始化和赋值是分开操作的，不能保证哪个先后。多线程的时候容易出问题。
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
