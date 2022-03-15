package com.oocode;

import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList {
	List<String> phoneNumberList;
	Boolean isEmpty;

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
	}

	public String retrieveItem(int i) {
		return "12345";
	}
}
