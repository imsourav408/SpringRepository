package com.nt.beans;

import java.util.Arrays;
import java.util.Date;

public class MarksInfo {
	private float marks[];
	private Date dates[];
	
	public void setMarks(float[] marks) {
		this.marks = marks;
	}
	public void setDates(Date[] dates) {
		this.dates = dates;
	}
	
	@Override
	public String toString() {
		return "MarksInfo [marks=" + Arrays.toString(marks) + ", dates=" + Arrays.toString(dates) + "]";
	}	
}
