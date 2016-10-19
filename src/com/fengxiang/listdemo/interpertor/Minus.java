package com.fengxiang.listdemo.interpertor;

public class Minus implements Express{

	@Override
	public int interpertor(Context context) {
		// TODO Auto-generated method stub
		return context.getNum1()-context.getNum2();
	}

}
