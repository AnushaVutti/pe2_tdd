package com.stackroute.unittest.p2;

import com.stackroute.unittest.p2.CheckPowerOf4;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class EvenNumTestTest {
    EvenNumTest evenNumTest=new EvenNumTest();
    @Test
    public void isEven_1(){

        assertEquals(true,evenNumTest.isEven(22));
    }
    @Test
    public void isEven_2(){

        assertEquals(false,evenNumTest.isEven(1));
    }
    @Test
    public void isNotNull(){
        assertNotNull(evenNumTest.isEven(8));
    }
}