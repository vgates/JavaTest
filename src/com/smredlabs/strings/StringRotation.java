package com.smredlabs.strings;

//    Input: “ABCD”, “DABC” (rotate one char to the right)
//    Output: true
//    Input: “ABCD”, “CDAB” (rotate two chars to the right)
//    Output: true
//    Input: “ABCD”, “ADBC”
//    Output: false

public class StringRotation {
    public static void main(String[] args) {
        String originalString = "ABCD";
        String rotatedString = "CDAB";
        System.out.println(checkIfRotatedConcatenate(originalString, rotatedString));
    }

    //simple solution - but we need extra space due to concatenation
    private static boolean checkIfRotatedConcatenate(String originalString, String rotatedString) {
        String modifiedString = originalString + originalString;
        return modifiedString.contains(rotatedString);
    }

    //another solution
    private static boolean checkIfRotated(String originalString, String checkWithString) {
        if (originalString.length() != checkWithString.length())
            return false;

        for (int i = 0; i < originalString.length(); i++) {
            String rotatedString = rotateString(originalString);
            if (rotatedString.equals(checkWithString))
                return true;
            originalString = rotatedString;
        }
        return false;
    }

    private static String rotateString(String string) {
        StringBuilder rotated = new StringBuilder();
        rotated.append(string.charAt(string.length() - 1));
        rotated.append(string.substring(0, string.length() - 1));
        return rotated.toString();
    }
}
