package com.fengxiang.listdemo.iterator;

public class MyIterator implements Iterator<String> {

	private Collection<String> collections;
	private int position = -1;

	public MyIterator(Collection<String> collections) {
		this.collections = collections;
	}

	@Override
	public String previous() {
		// TODO Auto-generated method stub
		if (position > 0) {
			position--;
		}
		return collections.get(position);
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		if (position < collections.size() - 1) {
			position++;
		}
		return collections.get(position);
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (position < collections.size() - 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String first() {
		// TODO Auto-generated method stub
		position = 0;
		return collections.get(position);
	}

	public String getElement() throws Exception {
		if (position >= 0 && position <= collections.size() - 1) {
			return collections.get(position);
		} else {
			throw new Exception("数组越界啦。。。。");
		}
	}

}
