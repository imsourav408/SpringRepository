package com.nt.test;

import java.lang.reflect.Constructor;

import com.nt.beans.TestBean;

public class PrivateConstructorAccessTestCoreJava {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Class<TestBean> c=null;
		Constructor<TestBean> cons[]=null;
		TestBean tb1=null,tb2=null;
		try {
			//load the class
			c=(Class<TestBean>)Class.forName("com.nt.beans.TestBean");
			cons=(Constructor<TestBean>[]) c.getDeclaredConstructors();
			cons[0].setAccessible(true);
			tb1=cons[0].newInstance();
			System.out.println(tb1);
			System.out.println("----------------------------------------------------------------------");
			cons[1].setAccessible(true);
			tb2=cons[1].newInstance(12,13);
			System.out.println(tb2);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}