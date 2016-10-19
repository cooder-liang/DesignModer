package com.fengxiang.listdemo.interpertor;

public class Plus implements Express{

	@Override
	public int interpertor(Context context) {
		// TODO Auto-generated method stub
		return context.getNum1()+context.getNum2();
	}

}
