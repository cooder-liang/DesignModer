package com.fengxiang.listdemo.bridge;

/**
 * 桥接模式就是把实物和其具体实现分开，他们可以各自独立的变化。（可以理解为将抽象化和实现化解耦，使的二者可以独立变化）
 * 
 * @author fengxiang
 *
 */
public abstract class Bridge {

	private BridgeSource source;

	public void method() {
		source.method();
	}

	public BridgeSource getSource() {
		return source;
	}

	public void setSource(BridgeSource source) {
		this.source = source;
	}

}
