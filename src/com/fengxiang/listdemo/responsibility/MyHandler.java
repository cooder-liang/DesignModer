package com.fengxiang.listdemo.responsibility;

public class MyHandler extends AbstractHandler implements Handler {

	private String name;

	public MyHandler(String name) {
		this.name = name;
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println(name + "deal!");
		if (getHandler() != null) {
			getHandler().operation();
		}
	}

}
