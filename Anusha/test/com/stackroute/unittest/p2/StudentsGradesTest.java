package com.stackroute.unittest.p2;

import com.stackroute.unittest.p2.StudentsGrades;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentsGradesTest {
    private StudentsGrades studentGrades = new StudentsGrades();
    @Test
    public void validInput_1(){
        int grades[]={98,90,87,95};
        assertEquals("error",studentGrades.validInput(-4,grades));
    }
    @Test
    public void validInput_2(){
        int grades[]={100,120,25,97};
        assertEquals("error",studentGrades.validInput(4,grades));
    }
    @Test
    public void validInput_3(){
        int grades[]={98,90,25,97};
        assertEquals("no error",studentGrades.validInput(4,grades));
    }
    @Test
    public void averageGrade(){
        int grades[]={98,90,87,95};
        assertEquals(92.5,studentGrades.averageGrade(4,grades));
    }
    @Test
    public void minGrade(){
        int grades[]={98,90,87,95};
        assertEquals(87,studentGrades.minGrade(4,grades));
    }
    @Test
    public void maxGrade(){
        int grades[]={98,90,87,95};
        assertEquals(98,studentGrades.maxGrade(4,grades));
    }

}