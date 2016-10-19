package com.fengxiang.listdemo.state;

/**
 * ״̬ģʽ:�����״̬�ı�ʱ����Ӧ����Ϊ�ı䡣
 * 
 * @author fengxiang
 *
 */
public class Context {

	private Status status;

	public Context(Status status) {
		this.status = status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}

	public void method() {
		if ("state1".equals(status.getName())) {
			status.method1();
		}
		if ("state2".equals(status.getName())) {
			status.method2();
		}
	}

}
