package com.fengxiang.listdemo.template;

/**
 * ģ�巽��ģʽ��������һ�������࣬��һ���������������ڶ���1--n��������������ʵ������ȥ��д��������ķ������Ӷ�ʵ��ģ��Ķ���
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
