package com.fengxiang.listdemo.command;

public class Invoker {

	private Command commander;

	public Invoker(Command commander) {
		this.commander = commander;
	}

	public void action() {
		System.out.println("去吧这件事给我办了。。。");
		commander.exe();
	}
}
