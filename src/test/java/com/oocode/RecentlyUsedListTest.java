package com.oocode;

import org.junit.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class RecentlyUsedListTest {

	@Test
	public void listShouldBeEmptyWhenInitialised(){
		assertThat(new RecentlyUsedList().isEmpty(), equalTo(true));
	}

	@Test
	public void listCanBeExtended(){
		RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		recentlyUsedList.addElement("12345");
		assertThat(recentlyUsedList.isEmpty(), equalTo(false));
	}

	@Test
	public void listItemsCanBeRetrieved(){
		RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		recentlyUsedList.addElement("12345");
		assertThat(recentlyUsedList.retrieveItem(0), equalTo("12345"));
	}

	@Test
	public void lastItemShouldBeFirstInList() {
		RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		recentlyUsedList.addElement("1");
		recentlyUsedList.addElement("2");
		recentlyUsedList.addElement("3");
		assertThat(recentlyUsedList.retrieveItem(0), equalTo("3"));
	}

	@Test
	public void itemsShouldBeStoredInReverseOrder(){
		RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		recentlyUsedList.addElement("1");
		recentlyUsedList.addElement("2");
		recentlyUsedList.addElement("3");
		assertThat(recentlyUsedList.retrieveItem(0), equalTo("3"));
		assertThat(recentlyUsedList.retrieveItem(1), equalTo("2"));
		assertThat(recentlyUsedList.retrieveItem(2), equalTo("1"));
	}

	@Test
	public void itemsShouldBeUnique(){
		RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		recentlyUsedList.addElement("1");
		recentlyUsedList.addElement("2");
		recentlyUsedList.addElement("1");
		assertThat(recentlyUsedList.retrieveItem(0), equalTo("1"));
		assertThat(recentlyUsedList.retrieveItem(1), equalTo("2"));
		assertThat(recentlyUsedList.getSize(), equalTo(2));
	}
}
