package com.nt.beans;

public class TestBean {
	private int a,b;
	
	private TestBean() {
		System.out.println("TestBean.TestBean()");
	}

	private TestBean(int a, int b) {
		System.out.println("TestBean.TestBean(-,-)");
		this.a = a;
		this.b = b;
	}
	
	//private static inner class nested inner class
	private static class DemoBean{
		private int c;
		
		public DemoBean() {
			System.out.println("TestBean.DemoBean.DemoBean()");
		}

		public void setC(int c) {
			this.c = c;
		}


		@Override
		public String toString() {
			return "DemoBean [c=" + c + "]";
		}
		
	}

	@Override
	public String toString() {
		return "TestBean [a=" + a + ", b=" + b + "]";
	}
}
	