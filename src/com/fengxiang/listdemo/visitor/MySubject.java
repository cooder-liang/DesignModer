package com.fengxiang.listdemo.visitor;

public class MySubject implements Subject{

	
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitor(this);
	}

	@Override
	public String getSubject() {
		// TODO Auto-generated method stub
		return "this is visitor moder...";
	}

}
