package com.fengxiang.listdemo.command;

public class MyCommander implements Command {

	private Recever recever;

	public MyCommander(Recever recever) {
		this.recever = recever;
	}

	@Override
	public void exe() {
		// TODO Auto-generated method stub
		recever.action();
	}

}
