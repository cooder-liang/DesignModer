package com.fengxiang.listdemo.command;

/**
 * 命令模式：就是要实现命令的发出者和实现者的解耦。实现请求和执行分开。其实structs就是这种典型的模式。
 * 
 * @author fengxiang
 *
 */
public interface Command {

	void exe();
}
