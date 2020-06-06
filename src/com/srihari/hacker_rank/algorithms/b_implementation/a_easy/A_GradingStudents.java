package com.srihari.hacker_rank.algorithms.b_implementation.a_easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/grading/problem
 */
public class A_GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        /*List<Integer> result = new ArrayList<>();
        for(int grade : grades){
            if(grade >= 38){
                result.add((5 - (grade % 5)) < 3 ? (int) (5 * Math.ceil(grade / 5.0)) : grade);
            } else {
                result.add(grade);
            }
        }
        return result;*/

        return grades.stream()
                .map(grade -> {
                    if(grade >= 38){
                        return ((5 - (grade % 5)) < 3 ? (int) (5 * Math.ceil(grade / 5.0)) : grade);
                    } else{
                        return grade;
                    }
                })
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(73, 67, 38, 33);
        List<Integer> result = gradingStudents(grades);
        System.out.println(result);
    }
}
