package com.fengxiang.listdemo.adapter;

/**
 * 类适配器模式 适配器模式，将某个类的接口转换成客户端希望的另一个接口，目的是消除由于接口不匹配所造成的类兼容性问题。
 * 适配器模式主要分为三类：a,类的适配器模式 b,对象的适配器模式 c,接口的适配器模式
 * 
 * @author fengxiang
 *
 */
public class AdapterModer extends Source implements Targetable {

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is Targetable method2...");
	}

}
