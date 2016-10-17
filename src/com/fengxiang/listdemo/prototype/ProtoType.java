package com.fengxiang.listdemo.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 原型模式：将一个对象作为原型 然后对其进行克隆复制，产生一个和原型对象类似的新对象。
 * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型还是指向原来对象所指的。
 * 深复制：将一个对象复制后，基本数据类型和引用数据类型都会重新创建。 要实现深复制，需要采用二进制流读入当前对象的二进制流，在写出对应的二进制流对象。
 * 
 * @author fengxiang
 *
 */
public class ProtoType implements Cloneable, Serializable {

	private static final long SERIALIZABLE_ID = 1L;
	private String str;
	private SerializableObject object;

	// 浅复制
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ProtoType protoType = (ProtoType) super.clone();
		return protoType;
	}

	// 深复制
	protected Object deepClone() throws IOException, ClassNotFoundException {
		// 写入当前二进制流对象
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(outputStream);
		oos.writeObject(this);

		// 读出当前二进制流对象
		ByteArrayInputStream innp = new ByteArrayInputStream(outputStream.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(innp);
		return ois.readObject();

	}

	class SerializableObject implements Serializable {
		private static final long SERIZALIZABLE_ID = 1L;
	}

	public String getString() {
		return str;
	}

	public void setString(String str) {
		this.str = str;
	}

	public SerializableObject getObject() {
		return object;
	}

	public void setObject(SerializableObject object) {
		this.object = object;
	}
}
