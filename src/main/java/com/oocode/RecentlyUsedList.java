package com.oocode;

import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList {
	List<String> phoneNumberList;
	Boolean isEmpty;
	String mostRecentInput;
	String secondMostRecentInput;
	String thirdMostRecentInput;

	public RecentlyUsedList () {
		List<String> phoneNumberList = new ArrayList<>();
		this.phoneNumberList = phoneNumberList;
		this.isEmpty = true;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void addElement(String s) {
		isEmpty = false;
		this.thirdMostRecentInput = this.secondMostRecentInput;
		this.secondMostRecentInput = this.mostRecentInput;
		this.mostRecentInput = s;

	}

	public String retrieveItem(int i) {
		if (i==0) {
			return this.mostRecentInput;
		}
		else if (i==1) {
			return this.secondMostRecentInput;
		}
		else {
			return this.thirdMostRecentInput;
		}
	}
}
