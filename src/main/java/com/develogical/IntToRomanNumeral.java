package com.develogical;

public class IntToRomanNumeral {
    public String convert(int arabicNum) {
        String romanNum = "";

        int romanI = arabicNum % 5;
        final int mult5 = arabicNum / 5;
        romanNum += fromMult5Int(mult5);
        romanNum += "I".repeat(romanI);
        if (romanNum.endsWith("IIII")) {
            String nextHigher = fromMult5Int(mult5 + 1);
            romanNum = "I" + nextHigher;
        }

        return romanNum;
    }

    private String fromMult5Int(final int mult) {
        if (mult == 1) {
            return "V";
        }
        if (mult == 2) {
            return "X";
        }
        return "";
    }
}
