package com.fengxiang.listdemo.facade;

/**
 * ���ģʽ��Ϊ�˽��������֮���������ϵ��������������֮�����϶ȡ�
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
		System.out.println("��������....");
		computer.startUp();
		memory.startUp();
		disk.startUp();
		System.out.println("������ɡ�������");
	}

	public void shutDown() {
		System.out.println("�رյ��ԡ�����");
		disk.shutDown();
		memory.shutDown();
		computer.shutDown();
		System.out.println("�ػ���ɡ�����");
	}

}
