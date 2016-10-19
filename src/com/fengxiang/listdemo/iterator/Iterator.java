package com.fengxiang.listdemo.iterator;

public interface Iterator<T> {

	/**
	 * ǰһ��
	 * 
	 * @return
	 */
	T previous();

	/**
	 * ��һ��
	 * 
	 * @return
	 */
	T next();

	/**
	 * �Ƿ�����һ��
	 * 
	 * @return
	 */
	boolean hasNext();

	/**
	 * ��һ��
	 * 
	 * @return
	 */
	T first();

}
