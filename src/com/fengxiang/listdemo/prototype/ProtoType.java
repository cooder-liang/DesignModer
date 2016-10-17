package com.fengxiang.listdemo.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * ԭ��ģʽ����һ��������Ϊԭ�� Ȼ�������п�¡���ƣ�����һ����ԭ�Ͷ������Ƶ��¶���
 * ǳ���ƣ���һ�������ƺ󣬻����������͵ı����������´��������������ͻ���ָ��ԭ��������ָ�ġ�
 * ��ƣ���һ�������ƺ󣬻����������ͺ������������Ͷ������´����� Ҫʵ����ƣ���Ҫ���ö����������뵱ǰ����Ķ�����������д����Ӧ�Ķ�����������
 * 
 * @author fengxiang
 *
 */
public class ProtoType implements Cloneable, Serializable {

	private static final long SERIALIZABLE_ID = 1L;
	private String str;
	private SerializableObject object;

	// ǳ����
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ProtoType protoType = (ProtoType) super.clone();
		return protoType;
	}

	// ���
	protected Object deepClone() throws IOException, ClassNotFoundException {
		// д�뵱ǰ������������
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(outputStream);
		oos.writeObject(this);

		// ������ǰ������������
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
