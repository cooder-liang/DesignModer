package com.fengxiang.listdemo;

import java.util.Vector;

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
import com.fengxiang.listdemo.command.Invoker;
import com.fengxiang.listdemo.command.MyCommander;
import com.fengxiang.listdemo.command.Recever;
import com.fengxiang.listdemo.composite.Tree;
import com.fengxiang.listdemo.composite.TreeNode;
import com.fengxiang.listdemo.decorator.Decorator;
import com.fengxiang.listdemo.decorator.SourceTarget;
import com.fengxiang.listdemo.facade.Facade;
import com.fengxiang.listdemo.factory.EMSFactory;
import com.fengxiang.listdemo.factory.Factory_Sender;
import com.fengxiang.listdemo.factory.MailFactory;
import com.fengxiang.listdemo.factory.Sender;
import com.fengxiang.listdemo.interpertor.Minus;
import com.fengxiang.listdemo.interpertor.Plus;
import com.fengxiang.listdemo.iterator.MyCollection;
import com.fengxiang.listdemo.iterator.MyIterator;
import com.fengxiang.listdemo.mediator.MyMediator;
import com.fengxiang.listdemo.memento.Origin;
import com.fengxiang.listdemo.memento.Storage;
import com.fengxiang.listdemo.observer.MySubject;
import com.fengxiang.listdemo.observer.Observe1;
import com.fengxiang.listdemo.observer.Observe2;
import com.fengxiang.listdemo.proxy.Proxy;
import com.fengxiang.listdemo.proxy.ProxySource;
import com.fengxiang.listdemo.responsibility.MyHandler;
import com.fengxiang.listdemo.state.Context;
import com.fengxiang.listdemo.state.Status;
import com.fengxiang.listdemo.strategy.CalculateJian;
import com.fengxiang.listdemo.strategy.CalculatorAdd;
import com.fengxiang.listdemo.strategy.CalculatorMulti;
import com.fengxiang.listdemo.strategy.ICalculator;
import com.fengxiang.listdemo.template.ImTemplate;
import com.fengxiang.listdemo.visitor.MyVisitor;

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
		System.out.println("=========代理模式===========");
		ProxySource p_source = new Proxy();
		p_source.method();
		System.out.println("=========外观模式===========");
		Facade facdade = new Facade();
		facdade.startUp();
		facdade.shutDown();
		System.out.println("=========桥接模式===========");
		Bridge bridge = new MyBridge();
		com.fengxiang.listdemo.bridge.Sourceable sour = new SourceStub();
		com.fengxiang.listdemo.bridge.Sourceable sour1 = new SourceStub2();
		bridge.setSourceable(sour);
		bridge.method();
		bridge.setSourceable(sour1);
		bridge.method();
		System.out.println("=========組合模式===========");
		Tree tree = new Tree("Honour's tree");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		nodeB.addChild(nodeC);
		tree.root.addChild(nodeB);
		System.out.println("build the tree finished!");

		System.out.println("=========策略者模式===========");
		/*
		 * Vector<ICalculator> cals = new Vector<>(); cals.add(new
		 * CalculatorAdd()); cals.add(new CalculateJian()); cals.add(new
		 * CalculatorMulti()); for (int i = 0; i < cals.size(); i++) {
		 * System.out.println(cals.elementAt(i).calculator("8-2")); }
		 */
		System.out.println("=========模板方法模式===========");
		System.out.println(new ImTemplate().unit());
		System.out.println("=========观察者模式===========");
		MySubject subject = new MySubject();
		subject.add(new Observe1());
		subject.add(new Observe2());
		subject.operation();
		System.out.println(subject.getObserve().size());
		System.out.println("=========迭代器模式===========");
		MyCollection collection = new MyCollection();
		MyIterator iterator = new MyIterator(collection);
		while (iterator.hasNext()) {
			try {
				System.out.print(iterator.next() + " ");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			System.out.println("这个元素是：" + iterator.getElement());
			System.out.println("上个个元素是：" + iterator.previous());
			System.out.println("下个元素是：" + iterator.next());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("=========责任链模式===========");
		MyHandler h1 = new MyHandler("h1");
		MyHandler h2 = new MyHandler("h2");
		MyHandler h3 = new MyHandler("h3");

		h1.setHandler(h2);
		h2.setHandler(h3);
		h1.operation();

		System.out.println("=========命令模式===========");
		Invoker invoker = new Invoker(new MyCommander(new Recever()));
		invoker.action();

		System.out.println("=========备忘录模式===========");
		// 创建原始类
		Origin origi = new Origin("init");

		// 创建备忘录
		Storage storage = new Storage(origi.createMemento());

		// 修改原始类的状态
		System.out.println("初始化状态为：" + origi.getName());
		origi.setName("niu");
		System.out.println("修改后的状态为：" + origi.getName());

		// 回复原始类的状态
		origi.restoreOrigin(storage.getMemento());
		System.out.println("恢复后的状态为：" + origi.getName());

		System.out.println("=========状态模式===========");
		Status state = new Status();
		Context context = new Context(state);

		// 设置第一种状态
		state.setName("state1");
		context.method();

		// 设置第二种状态
		state.setName("state2");
		context.method();
		System.out.println("=========状态模式===========");
		MyVisitor visitor=new MyVisitor();
		com.fengxiang.listdemo.visitor.MySubject sub=new com.fengxiang.listdemo.visitor.MySubject();
		sub.accept(visitor);
		System.out.println("=========中介者模式===========");
		MyMediator mediator=new MyMediator();
		mediator.createMediator();
		mediator.workAll();
		System.out.println("=========解释器模式===========");
		int result=new Minus().interpertor(new com.fengxiang.listdemo.interpertor.Context(new Plus().interpertor(new com.fengxiang.listdemo.interpertor.Context(9, 2)), 8));
		System.out.println(result);
	}

}
