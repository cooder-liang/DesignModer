package com.fengxiang.listdemo.iterator;

public interface Iterator<T> {

	/**
	 * 前一个
	 * 
	 * @return
	 */
	T previous();

	/**
	 * 后一个
	 * 
	 * @return
	 */
	T next();

	/**
	 * 是否还有下一个
	 * 
	 * @return
	 */
	boolean hasNext();

	/**
	 * 第一个
	 * 
	 * @return
	 */
	T first();

}
