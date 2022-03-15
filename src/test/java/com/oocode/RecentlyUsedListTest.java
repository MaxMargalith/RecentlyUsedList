package com.oocode;

import org.junit.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class RecentlyUsedListTest {

	@Test
	public void listShouldBeEmptyWhenInitialised(){
		assertThat(new RecentlyUsedList().isEmpty(), equalTo(true));
	};

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

}
