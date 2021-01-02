package com.nt.beans;

import java.util.Date;
import java.util.Set;

public class ContactInfo {
	private Set<Long> phoneNumbers;
	private Set<Date> dates;
	
	public ContactInfo(Set<Long> phoneNumbers, Set<Date> dates) {
		this.phoneNumbers = phoneNumbers;
		this.dates = dates;
	}

	@Override
	public String toString() {
		return "ContactInfo [phoneNumbers=" + phoneNumbers + ", dates=" + dates + "]";
	}	
}
