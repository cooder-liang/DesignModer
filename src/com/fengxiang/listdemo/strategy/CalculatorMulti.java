package com.fengxiang.listdemo.strategy;

public class CalculatorMulti extends AbstractCalculator implements ICalculator {

	@Override
	public int calculator(String str) {
		// TODO Auto-generated method stub
		int[] a = splite(str, "\\*");
		return a[0] * a[1];
	}

}
