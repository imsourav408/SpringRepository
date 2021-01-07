package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Arithmatic;
import com.nt.beans.WishMessageGenerator;
import com.nt.sdp.Printer;

public class BeanScopesTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMessageGenerator generator=null;
		Printer p1=null;
		Arithmatic arithmatic=null;
		//create IOC container
		//use file system resource 
	//	ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//use class path resource
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get target bean
		generator=ctx.getBean("wmg",WishMessageGenerator.class);
		System.out.println(generator.generateWishMessage("Raja"));
		System.out.println( "------------------------------------------------------------------");
		p1=ctx.getBean("p1",Printer.class); p1.printData("Hey, how are you?");
		System.out.println("------------------------------------------------------------------");
		arithmatic=ctx.getBean("arth",Arithmatic.class); arithmatic.addTwoNum(122,200);
		//close container
		((AbstractApplicationContext) ctx).close();
	}
}