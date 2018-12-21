package com.stackroute.unittest.p2;


public class Palindrome {
    public String reverseInput(String originalString) {
        StringBuffer stringBuffer = new StringBuffer(originalString);
        stringBuffer.reverse();
        String reverseString = stringBuffer.toString();
        return reverseString;
    }
    public boolean checkPalindrome(String originalString) {
        StringBuffer stringBuffer = new StringBuffer(originalString);
        stringBuffer.reverse();
        String reverseString = stringBuffer.toString();
        if (originalString.equals(reverseString))
            return true;
            return false;
    }
}
