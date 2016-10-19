package com.fengxiang.listdemo.iterator;

/**
 * ������ģʽ��˳����ʾۼ��еĶ�����仰����������˼���ۼ��Ķ���Ҫ���ʵĶ��󣬶�����������,���ڶԾۼ�����ķ��ʡ�
 * 
 * @author fengxiang
 *
 */
public interface Collection<T> {

	/**
	 * ����������
	 * 
	 * @return
	 */
	Iterator iterator();

	/**
	 * �ۼ�����Ĵ�С
	 * 
	 * @return
	 */
	int size();

	/**
	 * �ۼ������еĶ���
	 * 
	 * @return
	 */
	T get(int i);

}
