package com.stackroute.unittest.p2;

import java.util.Arrays;

public class StudentsGrades {
    public String validInput(int numberOfStudents, int grades[]){
        if (numberOfStudents<0)
            return "error";
        for (int i=0; i<grades.length;i++) {
            if (!(grades[i]>0 && grades[i]<100))
                return "error";
        }
        return "no error";
    }
    public float averageGrade (int numberOfStudents, int grades[]) {
        float sum=0;
        float average;
        for (int i=0; i<grades.length; i++){
            sum=sum+grades[i];
        }
        average=sum/(grades.length);
        return average;
    }
    public int minGrade (int numberOfStudents, int grades[]) {
        Arrays.sort(grades);
        return grades[0];
    }
    public int maxGrade (int numberOfStudents, int grades[]) {
        Arrays.sort(grades);
        return grades[grades.length-1];
    }


}
