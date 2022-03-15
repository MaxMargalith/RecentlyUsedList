package com.oocode;

import org.junit.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class RecentlyUsedListTest {

	@Test
	public void listShouldBeEmptyWhenInitialised(){
		assertThat(new RecentlyUsedList().isEmpty(), equalTo(true));
	};
	/*
	@Test
	public void
	*/
}
