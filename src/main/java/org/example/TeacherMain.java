package org.example;

import java.util.ArrayList;
import java.util.List;

public class TeacherMain {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();

        Teacher pankaj = new Teacher();
        pankaj.name = "Pankaj";
        pankaj.salary = 99000;
        teachers.add(pankaj);

         Teacher anu = new Teacher();
         anu.name = "Anu";
         anu.salary = 80000;
         teachers.add(anu);

        Teacher shikha = new Teacher();
        shikha.name = "Shikha";
        shikha.salary = 80000;
        teachers.add(shikha);

        Teacher lucky = new Teacher();
        lucky.name = "Lucky";
        lucky.salary = 80000;
        teachers.add(lucky);

        Teacher bruno = new Teacher();
        bruno.name = "Bruno";
        bruno.salary = 80000;
        teachers.add(bruno);
        List<Teacher> result = increaseSalary(teachers);
        for (Teacher teacher : result) {
            System.out.println("Name : " + teacher.name);
            System.out.println("Nmae :" + teacher.salary);
        }
        System.out.println(addSalary(teachers));
        for (Teacher teacher : teachers) {
            System.out.println("Name : " + teacher.name);
            System.out.println("Nmae :" + teacher.salary);
        }
        System.out.println(highestSalary(teachers).salary);


    }
    private static Integer addSalary(List<Teacher> teachers) {
        Integer sum = 0;
        for (Teacher teacher : teachers) {
            sum = sum + teacher.salary;
        }
        return sum;
    }





    private static List<Teacher> increaseSalary(List<Teacher> teachers ) {
        List<Teacher> newteachers = new ArrayList<>();
        for (Teacher teacher : teachers) {
            teacher.salary = teacher.salary + 5000;
            newteachers.add(teacher);
        }
        return newteachers;
    }

    private static Teacher highestSalary(List<Teacher> teachers) {
        Teacher salary = teachers.get(0);
        for (Teacher teacher : teachers) {
            if (teacher.salary > salary.salary) {
                salary =teacher;
            }
        }
        return salary;
    }


}
