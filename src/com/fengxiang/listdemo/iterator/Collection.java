package com.fengxiang.listdemo.iterator;

/**
 * 迭代器模式：顺序访问聚集中的对象，这句话包括两层意思，聚集的对象即要访问的对象，二迭代器对象,用于对聚集对象的访问。
 * 
 * @author fengxiang
 *
 */
public interface Collection<T> {

	/**
	 * 迭代器对象
	 * 
	 * @return
	 */
	Iterator iterator();

	/**
	 * 聚集对象的大小
	 * 
	 * @return
	 */
	int size();

	/**
	 * 聚集对象中的对象
	 * 
	 * @return
	 */
	T get(int i);

}
