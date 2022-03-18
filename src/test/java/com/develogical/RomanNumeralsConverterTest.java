package com.develogical;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RomanNumeralsConverterTest {


	@Test
	public void convertSimple() {
		assertThat(new IntToRomanNumeral().convert(1), equalTo("I"));
		assertThat(new IntToRomanNumeral().convert(2), equalTo("II"));
		assertThat(new IntToRomanNumeral().convert(3), equalTo("III"));
	}


}
