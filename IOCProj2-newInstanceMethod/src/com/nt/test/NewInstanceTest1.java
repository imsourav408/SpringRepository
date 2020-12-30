package com.nt.test;

import com.nt.comp.Test;

public class NewInstanceTest1 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Class<Test> c1=null,c2=null;
		Object obj1=null,obj2=null;
		try {
			//Load the classes
			c1=(Class<Test>) Class.forName(args[0]);
			c2=(Class<Test>) Class.forName(args[1]);
			//instantiate the loaded classes
			obj1=c1.newInstance();
			obj2=c2.newInstance();
			//print to console
			System.out.println(obj1);
			System.out.println("------------------------------------------------------------");
			System.out.println("Today: "+obj2);
		}//try
		catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		catch (IllegalAccessException iae) {
			iae.printStackTrace();
		}
		catch (InstantiationException ie) {
			ie.printStackTrace();
		}
	}
}
