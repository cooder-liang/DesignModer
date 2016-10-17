package com.fengxiang.listdemo.decorator;

/**
 * 装饰者模式 就是给一个对象增加一些新的功能，而且是动态的。要求装饰的对象和被装饰的对象实现统一接口，装饰对象持有被装饰对象。
 * 
 * @author fengxiang
 *
 */
public class Decorator implements SourceTarget {

	private SourceTarget sourceable;

	public Decorator(SourceTarget sourceable) {
		// TODO Auto-generated constructor stub
		this.sourceable = sourceable;
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("decorator before...");
		sourceable.method();
		System.out.println("decorator after...");
	}

}
