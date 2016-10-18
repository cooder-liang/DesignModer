package com.fengxiang.listdemo.composite;

public class Tree {
	
	public TreeNode root=null;
	
	public Tree(String name){
		root=new TreeNode(name);
		System.out.println(name);
	}
	
	

}
