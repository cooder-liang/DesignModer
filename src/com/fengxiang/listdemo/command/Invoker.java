package com.fengxiang.listdemo.command;

public class Invoker {

	private Command commander;

	public Invoker(Command commander) {
		this.commander = commander;
	}

	public void action() {
		System.out.println("ȥ������¸��Ұ��ˡ�����");
		commander.exe();
	}
}
