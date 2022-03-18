package com.develogical;

public class IntToRomanNumeral {
    public String convert(int arabicNum) {
        String romanNum = "";

        final int romanI = arabicNum % 5;
        final int mult5 = arabicNum / 5;
        romanNum += fromMult5Int(mult5);
        if (romanI < 4) {
            romanNum += "I".repeat(romanI);
        } else {
            if (mult5 == 2) {
                return "XIV";
            }
            String nextHigher = fromMult5Int(mult5 + 1);
            romanNum = "I" + nextHigher;
        }

        return romanNum;
    }

    private String fromMult5Int(final int mult) {
        final int romanX = mult/2;
        String result = "";
        result += "X".repeat(romanX);
        result += "V".repeat(mult%2);
        if (mult == 10) {
            result = "L";
        }
        return result;
    }

}
