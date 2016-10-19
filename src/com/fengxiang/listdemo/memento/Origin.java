package com.fengxiang.listdemo.memento;

/**
 * ����¼ģʽ������һ�������ĳ��״̬���Ա�����Ҫ��ʱ����лָ���Ҳ�������Ϊ����ģʽ��
 * 
 * @author fengxiang
 *
 */
public class Origin {

	private String name;

	public Origin(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void restoreOrigin(Memento memento) {
		this.name = memento.getName();
	}

	public Memento createMemento() {
		return new Memento(name);
	}
}
