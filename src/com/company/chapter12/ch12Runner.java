package com.company.chapter12;

import java.util.Arrays;

public class ch12Runner {
    public static void run(){
        Professor professor1 = new Professor("lecture", new Lecture("test", 70, Arrays.asList(81,95,75,20,30)));

        Professor professor2 = new Professor("lectureWithGrade",
                new GradeLecture("test", 70, Arrays.asList(81,95,75,20,30),
                        Arrays.asList(new Grade("A",100,95),
                                new Grade("B",95,80),
                                new Grade("C",80,0))));

        System.out.println(professor1.compileStatistics());
        System.out.println(professor2.compileStatistics());
    }
}
