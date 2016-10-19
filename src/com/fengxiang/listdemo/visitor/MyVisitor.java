package com.fengxiang.listdemo.visitor;

public class MyVisitor implements Visitor{

	@Override
	public void visitor(Subject subject) {
		// TODO Auto-generated method stub
		System.out.println("visitor the subject:"+subject.getSubject());
	}

}
