package com.fengxiang.listdemo.visitor;

/**
 * ������ģʽ�����ǰ����ݽṹ�����������ݽṹ�ϵĲ������
 * @author Administrator
 *
 */
public interface Subject {
	void accept(Visitor visitor);
	
	String getSubject();
	
}
