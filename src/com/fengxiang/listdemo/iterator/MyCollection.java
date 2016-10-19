package com.fengxiang.listdemo.iterator;

public class MyCollection implements Collection<String> {

	private String[] str = { "q", "w", "e", "r", "t", "y", "u", "i", "o" };

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return (Iterator) new MyIterator(this);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return str.length;
	}

	@Override
	public String get(int i) {
		// TODO Auto-generated method stub
		return str[i];
	}

}
