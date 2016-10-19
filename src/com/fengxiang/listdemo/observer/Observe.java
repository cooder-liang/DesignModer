package com.fengxiang.listdemo.observer;

/**
 * 观察者模式：发生在类和类之间的关系，不涉及到继承。
 * 类似于邮件的订阅，注册一下，被观察者有跟新就会通知你，简单的说就是当一个对象发生变化时，其它依赖的对象会收到通知。
 * 
 * @author fengxiang
 *
 */
public interface Observe {
	void update();
}
