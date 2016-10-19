package com.fengxiang.listdemo.memento;

/**
 * 备忘录模式：保存一个对象的某种状态，以便在需要的时候进行恢复。也可以理解为备份模式。
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
