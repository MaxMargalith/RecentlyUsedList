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
	public void convertNumbers() {
		checkConversion(1, "I");
		checkConversion(2, "II");
		checkConversion(3, "III");
		checkConversion(4, "IV");
		checkConversion(5, "V");
		checkConversion(6, "VI");
		checkConversion(7, "VII");
		checkConversion(8, "VIII");
		checkConversion(9, "IX");
		checkConversion(10, "X");
		checkConversion(11, "XI");
		checkConversion(12, "XII");
		checkConversion(13, "XIII");
		checkConversion(14, "XIV");
		checkConversion(15, "XV");
		checkConversion(16, "XVI");
		checkConversion(17, "XVII");
		checkConversion(18, "XVIII");
		checkConversion(19, "XIX");
		checkConversion(20, "XX");
		checkConversion(21, "XXI");
		checkConversion(22, "XXII");
		checkConversion(23, "XXIII");
		checkConversion(24, "XXIV");
	}

	@Test
	public void convertAdvanced() {
		checkConversion(50, "L");

	}

	private void checkConversion(int arabicNum, String romanNum) {
		assertThat(new IntToRomanNumeral().convert(arabicNum), equalTo(romanNum));
	}

}
