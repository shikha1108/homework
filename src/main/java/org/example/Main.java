package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        List<Student> students = new ArrayList<>();
        Student shikha = new Student();
        shikha.name = "Shikha";
        shikha.numbers = 79;
        students.add(shikha);

        Student lucky =new Student();
        lucky.name = "Lucky";
        lucky.numbers = 50;
        students.add(lucky);

        Student mamta = new Student();
        mamta.name = "Mamta";
        mamta.numbers = 100;
        students.add(mamta);
        Student result = printTopper(students);
        System.out.println(result.name);
    }
    private static Student printTopper(List<Student> st) {
        Student topper = st.get(0);
        for (Student student : st) {
            if(student.numbers > topper.numbers){
                topper = student;
            }
        }
        return topper;
    }

    //Given a list of students, return a list of students who failed the exam.
}
