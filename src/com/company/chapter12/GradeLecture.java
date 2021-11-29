package com.company.chapter12;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class GradeLecture extends Lecture{

    private List<Grade> grades;

    public GradeLecture( String title, int pass, List<Integer> scores, List<Grade> grades) {
        super(title, pass, scores);
        this.grades = grades;
    }

    @Override
    public String evaluate() {
        return super.evaluate() + ", " + greadesStatistics();
    }

    private String greadesStatistics() {
        return grades.stream().map(grade -> format(grade)).collect(joining(" "));
    }

    private String format(Grade grade) {
        return String.format("%s:%d", grade.getName(),gradeCount(grade));
    }

    private long gradeCount(Grade grade) {
        return getScores().stream().filter(score->grade.include(score)).count();
    }
}
