package com.fengxiang.listdemo.proxy;

/**
 * ����ģʽ ����˼�� ���Ƕ�һ���������������ԭ������һЩ������
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
