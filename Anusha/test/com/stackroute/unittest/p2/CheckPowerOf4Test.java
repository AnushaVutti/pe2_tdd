package com.stackroute.unittest.p2;

import com.stackroute.unittest.p2.CheckPowerOf4;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckPowerOf4Test {
    private CheckPowerOf4 check = new CheckPowerOf4();

    @Test
    public  void power4Integer () {

        assertEquals(true,check.checkPowerOfFour(64));
    }
    @Test
    public  void notPower4 () {

        assertEquals(false,check.checkPowerOfFour(32));
    }
    @Test
    public void power4Decimal() {

        assertEquals(true, check.checkPowerOfFourDecimal(0.0625));
    }


}