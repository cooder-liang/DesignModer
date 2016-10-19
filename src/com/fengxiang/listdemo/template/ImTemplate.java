package com.fengxiang.listdemo.template;

import java.util.Arrays;

public class ImTemplate extends Template {

	@Override
	public String unit() {
		// TODO Auto-generated method stub
		String[] str = splite("you,are,never,wrong", ",");
		return Arrays.toString(str);
	}

}
