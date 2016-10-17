package com.fengxiang.listdemo.decorator;

/**
 * װ����ģʽ ���Ǹ�һ����������һЩ�µĹ��ܣ������Ƕ�̬�ġ�Ҫ��װ�εĶ���ͱ�װ�εĶ���ʵ��ͳһ�ӿڣ�װ�ζ�����б�װ�ζ���
 * 
 * @author fengxiang
 *
 */
public class Decorator implements SourceTarget {

	private SourceTarget sourceable;

	public Decorator(SourceTarget sourceable) {
		// TODO Auto-generated constructor stub
		this.sourceable = sourceable;
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("decorator before...");
		sourceable.method();
		System.out.println("decorator after...");
	}

}
