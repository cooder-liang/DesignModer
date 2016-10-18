package com.fengxiang.listdemo.facade;

/**
 * 外观模式：为了解决类与类之间的依赖关系，降低了类与类之间的耦合度。
 * 
 * @author fengxiang
 *
 */
public class Facade {

	private Computer computer;
	private Memory memory;
	private Disk disk;

	public Facade() {
		// TODO Auto-generated constructor stub
		computer = new Computer();
		memory = new Memory();
		disk = new Disk();
	}

	public void startUp() {
		System.out.println("启动电脑....");
		computer.startUp();
		memory.startUp();
		disk.startUp();
		System.out.println("启动完成。。。。");
	}

	public void shutDown() {
		System.out.println("关闭电脑。。。");
		disk.shutDown();
		memory.shutDown();
		computer.shutDown();
		System.out.println("关机完成。。。");
	}

}
