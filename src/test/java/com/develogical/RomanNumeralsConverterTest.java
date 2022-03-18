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
		checkConversion(1, "I");
		checkConversion(2, "II");
		checkConversion(3, "III");
	}
	@Test
	public void convertSlightlyAdvanced() {
		checkConversion(5, "V");
		checkConversion(6, "VI");
		checkConversion(7, "VII");
		checkConversion(8, "VIII");
		checkConversion(10, "X");
		checkConversion(11, "XI");
		checkConversion(12, "XII");
		checkConversion(13, "XIII");
	}

	@Test
	public void convertAdvanced() {
		checkConversion(4, "IV");

	}

	private void checkConversion(int arabicNum, String romanNum) {
		assertThat(new IntToRomanNumeral().convert(arabicNum), equalTo(romanNum));
	}

}
