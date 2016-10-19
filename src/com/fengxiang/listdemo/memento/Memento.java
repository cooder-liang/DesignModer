package com.fengxiang.listdemo.memento;

public class Memento {

	private String name;

	public Memento(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
