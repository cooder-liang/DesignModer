package com.fengxiang.listdemo.adapter;

/**
 * �����������ģʽ �˴��ǳ���Source����
 * 
 * @author fengxiang
 *
 */
public class Wrapper implements Targetable {

	private Source source;

	public Wrapper(Source source) {
		// TODO Auto-generated constructor stub
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		source.method1();
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is targetable method2... ");
	}

}
