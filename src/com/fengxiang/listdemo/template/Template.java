package com.fengxiang.listdemo.template;

/**
 * 模板方法模式：即定义一个抽象类，有一个主方法，其余在定义1--n个方法，在它的实现类中去重写或调用它的方法。从而实现模板的定义
 * 
 * @author fengxiang
 *
 */
public abstract class Template {

	public String[] splite(String str, String opt) {
		String[] str1 = str.split(opt);
		return str1;
	}

	public abstract String unit();

}
