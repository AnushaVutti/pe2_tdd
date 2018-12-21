package com.stackroute.unittest.p2;

import com.stackroute.unittest.p2.MemberVariable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MemberVariableTest {
    private MemberVariable memberVariable= new MemberVariable();
 @Test
    public void addMember () {

     assertEquals("Name: Anusha Age: 21 Salary: 48000.0", memberVariable.addMember("Anusha", 21, 48000.0));
 }
}
