package com.fengxiang.listdemo;

import com.fengxiang.listdemo.adapter.AdapterModer;
import com.fengxiang.listdemo.adapter.Source;
import com.fengxiang.listdemo.adapter.Source1;
import com.fengxiang.listdemo.adapter.Source2;
import com.fengxiang.listdemo.adapter.Sourceable;
import com.fengxiang.listdemo.adapter.Targetable;
import com.fengxiang.listdemo.adapter.Wrapper;
import com.fengxiang.listdemo.bridge.Bridge;
import com.fengxiang.listdemo.bridge.MyBridge;
import com.fengxiang.listdemo.bridge.SourceStub;
import com.fengxiang.listdemo.bridge.SourceStub2;
import com.fengxiang.listdemo.builder.Builder;
import com.fengxiang.listdemo.composite.Tree;
import com.fengxiang.listdemo.composite.TreeNode;
import com.fengxiang.listdemo.decorator.Decorator;
import com.fengxiang.listdemo.decorator.SourceTarget;
import com.fengxiang.listdemo.factory.EMSFactory;
import com.fengxiang.listdemo.factory.Factory_Sender;
import com.fengxiang.listdemo.factory.MailFactory;
import com.fengxiang.listdemo.factory.Sender;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory_Sender sender = new Factory_Sender();
		sender.sender("mail").send("xxx");
		sender.sender("sms").send("xxx");
		sender.sender("xxx").send("xxx");
		System.out.println("====================");
		Factory_Sender.getEmsSender().send("xxx");
		Factory_Sender.getMailSender().send("xxx");
		System.out.println("====================");
		new EMSFactory().produce().send("xxx");
		new MailFactory().produce().send("xxx");
		System.out.println("====================");
		Builder builder = new Builder();
		builder.produceMailSender(6);
		builder.produceEmsSender(6);
		for (Sender x : builder.getContent()) {
			x.send("xxx");
		}
		System.out.println("====================");
		Targetable targetable = new AdapterModer();
		targetable.method1();
		targetable.method2();
		System.out.println("=========适配器模式===========");
		Source source = new Source();
		Wrapper wrapper = new Wrapper(source);
		wrapper.method1();
		wrapper.method2();
		System.out.println("=========接口适配器模式===========");
		Sourceable source1 = new Source1();
		Sourceable source2 = new Source2();
		source1.method1();
		source1.method2();
		source1.method3();
		source2.method1();
		source2.method2();
		source2.method3();
		System.out.println("=========装饰者模式===========");
		SourceTarget target = new com.fengxiang.listdemo.decorator.Source();
		SourceTarget souc = new Decorator(target);
		souc.method();
		System.out.println("=========桥接模式===========");
		Bridge bridge=new MyBridge();
		com.fengxiang.listdemo.bridge.Sourceable sour=new SourceStub();
		com.fengxiang.listdemo.bridge.Sourceable sour1=new SourceStub2();
		bridge.setSourceable(sour);
		bridge.method();
		bridge.setSourceable(sour1);
		bridge.method();
		System.out.println("=========組合模式===========");
		Tree tree=new Tree("Honour's tree");
		TreeNode nodeB = new TreeNode("B");  
        TreeNode nodeC = new TreeNode("C");  
        nodeB.addChild(nodeC);
        tree.root.addChild(nodeB);
        System.out.println("build the tree finished!");  
	}
}
