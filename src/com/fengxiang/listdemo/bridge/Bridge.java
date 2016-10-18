package com.fengxiang.listdemo.bridge;

/**
 * �Ž�ģʽ���ǰ�ʵ��������ʵ�ַֿ������ǿ��Ը��Զ����ı仯�����������Ϊ�����󻯺�ʵ�ֻ����ʹ�Ķ��߿��Զ����仯��
 * 
 * @author fengxiang
 *
 */
public abstract class Bridge {

	private Sourceable sourceable;

	public void method() {
		sourceable.method();
	}

	public void setSourceable(Sourceable sourceable) {
		this.sourceable = sourceable;
	}

	public Sourceable getSourceable() {
		return sourceable;
	}

}
