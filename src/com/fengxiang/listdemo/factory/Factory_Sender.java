package com.fengxiang.listdemo.factory;

public class Factory_Sender {

	// 工厂方法模式
	public Sender sender(String str) {
		if ("mail".equals(str)) {
			return new MailSender();
		} else if ("sms".equals(str)) {
			return new EmsSender();
		} else {
			return new Sender() {

				@Override
				public void send(String str) {
					// TODO Auto-generated method stub
					System.out.println("please tell me who is sender");
				}
			};
		}
	}

	// 静态工厂方法模式
	public static Sender getEmsSender() {
		return new EmsSender();
	}

	public static Sender getMailSender() {
		return new MailSender();
	}

	// 抽象工厂模式 扩展性好，更符合闭包原则。例子：Provider MailFactory EMSFactory。

}
