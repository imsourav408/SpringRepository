package com.nt.beans;

import org.springframework.beans.factory.annotation.Required;

public final class PersonsInfo {
	private int pid;
	private String pname;
	private String padd;
	
	public int getPid() {
		return pid;
	}
	
	@Required
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public String getPname() {
		return pname;
	}
	
	@Required
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public String getPadd() {
		return padd;
	}
	
	public void setPadd(String padd) {
		this.padd = padd;
	}

	@Override
	public String toString() {
		return "PersonsInfo [pid=" + pid + ", pname=" + pname + ", padd=" + padd + "]";
	}
}
