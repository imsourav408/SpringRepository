package com.nt.beans;

import java.util.Properties;

public class FruitsInfo {
	private Properties props;

	public void setProps(Properties props) {
		this.props = props;
	}

	@Override
	public String toString() {
		return "FruitsInfo [props=" + props + "]";
	}
}