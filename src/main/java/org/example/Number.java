package org.example;

import java.util.ArrayList;
import java.util.List;

public class Number {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
