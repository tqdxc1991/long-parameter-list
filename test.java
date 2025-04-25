package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CodeSmells {

    private void checkResult(String subject, double student1, double student2, double student3, double student4, double student5) {
        List<Double> studentMarks = new ArrayList<>();

        if(student1 < 0 || student2 < 0 || student3 < 0 || student4 < 0 || student5 < 0) {
            System.out.println("One or more student has negative marks");
            return;
        } else {
            studentMarks.add(student1); // Add to list
            studentMarks.add(student2); // Add to list
            studentMarks.add(student3); // Add to list
            studentMarks.add(student4); // Add to list
            studentMarks.add(student5); // Add to list

            for(int i = 0; i < studentMarks.size(); i++) {
                if(studentMarks.get(i) > 50) {
                    print(studentMarks.get(i), "PASS"); // Pass the student
                } else {
                    print(studentMarks.get(i), "FAIL"); // Fail the student
                }
            }
        }
    }

    public void print(double student, String result) {
        if(student > 0) {
            System.out.println("Student Result : " + student + " - " + result);
        }
    }
}
