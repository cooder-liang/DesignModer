package com.fengxiang.listdemo.observer;

/**
 * �۲���ģʽ�������������֮��Ĺ�ϵ�����漰���̳С�
 * �������ʼ��Ķ��ģ�ע��һ�£����۲����и��¾ͻ�֪ͨ�㣬�򵥵�˵���ǵ�һ���������仯ʱ�����������Ķ�����յ�֪ͨ��
 * 
 * @author fengxiang
 *
 */
public interface Subject {
	/**
	 * ��ӹ۲���
	 * 
	 * @param observer
	 */
	void add(Observe observer);

	/**
	 * �Ƴ��۲���
	 * 
	 * @param observer
	 */
	void delete(Observe observer);

	/**
	 * ����Ĳ���
	 * 
	 * @param observer
	 */
	void operation();

	/**
	 * ֪ͨ�۲���
	 * 
	 * @param observer
	 */
	void notiflyObserver();
}
