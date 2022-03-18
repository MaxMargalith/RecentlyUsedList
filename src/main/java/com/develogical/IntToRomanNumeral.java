package com.develogical;

public class IntToRomanNumeral {
    public String convert(int arabicNum) {
        String romanNum = "";

        if (arabicNum == 10) {
            return "X";
        }
        if (arabicNum == 4) {
            return "IV";
        }
        int romanI = arabicNum % 5;
        final int mult5 = arabicNum / 5;
        if (arabicNum >= 5) {
            if (mult5 <= 1) {
                romanNum += "V";
            }
            else {
                romanNum += "X";
            }
        }
        romanNum += "I".repeat(romanI);

        return romanNum;
    }
}
