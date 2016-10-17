package com.fengxiang.listdemo.factory;

public class Factory_Sender {

	// ��������ģʽ
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

	// ��̬��������ģʽ
	public static Sender getEmsSender() {
		return new EmsSender();
	}

	public static Sender getMailSender() {
		return new MailSender();
	}

	// ���󹤳�ģʽ ��չ�Ժã������ϱհ�ԭ�����ӣ�Provider MailFactory EMSFactory��

}
