package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        List<Student> students = new ArrayList<>();
        Student shikha = new Student();
        shikha.name = "Shikha";
        shikha.numbers = 79;
        shikha.fees = 1200;  //class10
        students.add(shikha);

        Student lucky = new Student();
        lucky.name = "Lucky";
        lucky.numbers = 50;
        lucky.fees = 1000; //class 8
        students.add(lucky);

        Student mamta = new Student();
        mamta.name = "Mamta";
        mamta.numbers = 100;
        mamta.fees = 2000;// class12
        students.add(mamta);

        //failed student list

        Student shi = new Student();
        shi.name = "Shi";
        shi.numbers = 20;
        shi.fees= 1200;
        students.add(shi);


        Student bruno = new Student();
        bruno.name = " bruno";
        bruno.numbers = 20;
        students.add(bruno);


        Student tom = new Student();
        tom.name = "Tom";
        tom.numbers = 10;
        students.add(tom);


        Student jerry = new Student();
        jerry.name = "Jerry";
        jerry.numbers = 15;
        students.add(jerry);


        Student bravo = new Student();
        bravo.name = "Bravo";
        bravo.numbers = 25;
        students.add(bravo);


        Student arthur = new Student();
        arthur.name = "Arthur";
        arthur.numbers = 30;
        students.add(arthur);


       // Student result = printTopper(students);
        List<Student> failed = getFailed(students, 30);
        for (Student student : failed) {
            System.out.println(student.name);
        }

       // System.out.println(result.name);
        System.out.println(schoolFeesCalculation(students));
        for (Student student : students) {
            System.out.println(("Name : " + student.fees));
        }

    }

    private static Student printTopper(List<Student> st) {
        Student topper = st.get(0);
        for (Student student : st) {
            if (student.numbers > topper.numbers) {
                topper = student;
            }
        }
        return topper;


    }
    //Given a list of students, return a list of students who failed the exam.
    private static List<Student> getFailed(List<Student> st, int minMarks) {
        List<Student> failed = new ArrayList<>();
        for (Student student : st) {
            if(student.numbers < minMarks) {
                failed.add(student);
            }
        }

        return failed;
    }
    private static Integer schoolFeesCalculation(List<Student> studentList) {
        Integer sum = 0;
        for (Student student1 : studentList) {
            sum = sum + student1.fees;
        }
        return sum;
    }



}
