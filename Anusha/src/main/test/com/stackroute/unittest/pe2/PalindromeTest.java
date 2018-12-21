package com.stackroute.unittest.p2;

import com.stackroute.unittest.p2.Palindrome;
import org.junit.Test;

import static junit.framework.Assert.assertNotSame;
import static org.junit.Assert.assertEquals;

public class PalindromeTest {
    private Palindrome palindrome = new Palindrome();
    @Test
    public void reverseInput_1 () {

        assertEquals("malayalam",palindrome.reverseInput("malayalam"));
    }
    @Test
    public void reverseInput_2 () {

        assertEquals("olleh",palindrome.reverseInput("hello"));
    }
    @Test
    public void notSamePalindrome () {

        assertEquals(false,palindrome.checkPalindrome("hellomadam"));
    }
    @Test
    public void checkPalindrome () {

        assertEquals(true,palindrome.checkPalindrome("malayalam"));
    }


}