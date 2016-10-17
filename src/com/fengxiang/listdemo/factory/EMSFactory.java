package com.fengxiang.listdemo.factory;

public class EMSFactory implements Provider {

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new EmsSender();
	}

}
