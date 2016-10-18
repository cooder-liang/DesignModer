package com.fengxiang.listdemo.bridge;

/**
 * �Ž�ģʽ���ǰ�ʵ��������ʵ�ַֿ������ǿ��Ը��Զ����ı仯�����������Ϊ�����󻯺�ʵ�ֻ����ʹ�Ķ��߿��Զ����仯��
 * 
 * @author fengxiang
 *
 */
public abstract class Bridge {

	private BridgeSource source;

	public void method() {
		source.method();
	}

	public BridgeSource getSource() {
		return source;
	}

	public void setSource(BridgeSource source) {
		this.source = source;
	}

}
