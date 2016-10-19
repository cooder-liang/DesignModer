package com.fengxiang.listdemo.strategy;

public abstract class AbstractCalculator {

	public int[] splite(String dex, String opt) {
		String[] str = dex.split(opt);
		int[] arr_int = new int[2];
		arr_int[0] = Integer.parseInt(str[0]);
		arr_int[1] = Integer.parseInt(str[1]);
		return arr_int;
	}

}
