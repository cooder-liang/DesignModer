package com.fengxiang.listdemo.strategy;

/**
 * 策略者模式：定义了一系列的算法，并把它们封装起来，且算法的替换不会影响到用户的体验。
 * 
 * @author fengxiang
 *
 */
public interface ICalculator {
	int calculator(String str);
}
