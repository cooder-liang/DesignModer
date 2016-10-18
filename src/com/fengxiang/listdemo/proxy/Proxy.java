package com.fengxiang.listdemo.proxy;

/**
 * 代理模式 顾名思义 就是多一个代理类出来，替原对象做一些操作。
 * 
 * @author fengxiang
 *
 */
public class Proxy implements ProxySource {

	private ProxySource source;

	public Proxy() {
		// TODO Auto-generated constructor stub
		source = new ProxyImpl();
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		before();
		source.method();
		after();
	}

	public void before() {
		System.out.println("proxy before...");
	}

	public void after() {
		System.out.println("proxy after...");
	}

}
