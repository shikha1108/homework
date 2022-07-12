package org.example;

import java.util.ArrayList;
import java.util.List;

public class Minimum {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(50);
        numbers.add(80);
        numbers.add(90);
        System.out.println(minimum(numbers));
    }

    private static List<Integer> minimum(List<Integer> nums) {
        Integer mini = nums.get(0);
        for (Integer num : nums) {
            if (num < mini) {
                mini = num;
            }
        }
    }
}
