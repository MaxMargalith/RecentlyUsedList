package com.oocode;

import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList {
	List<String> phoneNumberList;

	public RecentlyUsedList () {
		this.phoneNumberList = new ArrayList<>();
	}

	public boolean isEmpty() {
		if (phoneNumberList.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void addElement(String s) {
		removeDuplicateIfExists(s);
		this.phoneNumberList.add(0, s);
	}

	public String retrieveItem(int i) {
		return this.phoneNumberList.get(i);
	}

	public int getSize() {
		return phoneNumberList.size();
	}

	public void removeDuplicateIfExists(String s) {
		if (this.phoneNumberList.contains(s)) {
			this.phoneNumberList.remove(s);
		}
	}
}
