package com.fengxiang.listdemo.visitor;

/**
 * 访问者模式：就是把数据结构和作用于数据结构上的操作解耦。
 * @author Administrator
 *
 */
public interface Subject {
	void accept(Visitor visitor);
	
	String getSubject();
	
}
