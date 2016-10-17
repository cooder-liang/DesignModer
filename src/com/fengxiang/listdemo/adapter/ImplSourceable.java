package com.fengxiang.listdemo.adapter;

/**
 * 接口适配器模式
 * 
 * @author fengxiang
 *
 */
public abstract class ImplSourceable implements Sourceable {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("this is Soucrce method1...");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is Soucrce method2...");
	}

	public void method3() {
		System.out.println("this is Soucrce method3...");
	};
}
