package com.nt.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.nt.comp.Test;

public class NewInstanceTest2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Class<Test> c=null;
		Constructor<Test> cons[]=null;
		Object obj=null;
		try {
			//Load the given class
			c=(Class<Test>) Class.forName(args[0]);
			//get all the constructors
			cons=(Constructor<Test>[]) c.getDeclaredConstructors();
			//instantiate the class
			obj=cons[0].newInstance(10,20);
			//print details to console
			System.out.println(obj);
		}//try
		catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		catch (IllegalAccessException iacc) {
			iacc.printStackTrace();
		}
		catch (InstantiationException ie) {
			ie.printStackTrace();
		} catch (IllegalArgumentException iae) {
			iae.printStackTrace();
		} catch (InvocationTargetException ite) {
			ite.printStackTrace();
		}
	}//main
}//class
