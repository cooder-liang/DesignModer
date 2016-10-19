package com.fengxiang.listdemo.observer;

import java.util.Vector;

public abstract class AbstractSubject implements Subject {

	private Vector<Observe> obs = new Vector<>();

	@Override
	public void add(Observe observer) {
		// TODO Auto-generated method stub
		obs.add(observer);
	}

	@Override
	public void delete(Observe observer) {
		// TODO Auto-generated method stub
		obs.remove(observer);
	}

	@Override
	public void notiflyObserver() {
		// TODO Auto-generated method stub
		for (int i = 0; i < obs.size(); i++) {
			obs.elementAt(i).update();
		}
	}

	public Vector<Observe> getObserve() {
		return obs;
	}

}
