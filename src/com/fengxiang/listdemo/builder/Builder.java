package com.fengxiang.listdemo.builder;

import java.util.ArrayList;
import java.util.List;

import com.fengxiang.listdemo.factory.EmsSender;
import com.fengxiang.listdemo.factory.MailSender;
import com.fengxiang.listdemo.factory.Sender;

/**
 * ������ģʽ ���������Ͷ�����ν�����Ͷ������ָĳ������в�ͬ�����ԡ�
 * 
 * @author fengxiang
 *
 */
public class Builder {

	private List<Sender> list = new ArrayList<>();

	public void produceMailSender(int count) {
		if (list != null) {
			for (int i = 0; i < count; i++) {
				list.add(new MailSender());
			}
		}

	}

	public void produceEmsSender(int count) {
		if (list != null) {
			for (int i = 0; i < count; i++) {
				list.add(new EmsSender());
			}
		}
	}

	public List<Sender> getContent() {
		return list;
	}

}
