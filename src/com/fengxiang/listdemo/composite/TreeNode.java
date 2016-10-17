package com.fengxiang.listdemo.composite;

import java.util.Enumeration;
import java.util.Vector;

public class TreeNode {
	
	private String name;
	private TreeNode parent;
	private Vector<TreeNode> children=new Vector<>();
	
	public TreeNode(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
		System.out.println(name);
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setParent(TreeNode parent){
		this.parent=parent;
	}
	
	public TreeNode getParent(){
		return parent;
	}
	
	public void addChild(TreeNode node){
		children.add(node);
	}
	
	public void deleteChild(TreeNode node){
		children.remove(node);
	}
	
	public Enumeration<TreeNode> getChild(){
		return children.elements();
	}

}
