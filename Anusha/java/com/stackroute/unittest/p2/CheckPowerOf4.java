package com.stackroute.unittest.p2;

import static java.lang.Math.log;

public class CheckPowerOf4 {

     public boolean checkPowerOfFour (double num) {
        if (num%4!=0)
            return false;
        while (num!=1) {
            if (num%4!=0)
                return false;
            num = num/4;
        }
        return true;
    }
    public boolean checkPowerOfFourDecimal(double num) {
         if((log(num)%log(4))==0)
             return true;
         return false;
    }
}
