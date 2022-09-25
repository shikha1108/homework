package org.example;

import java.util.ArrayList;
import java.util.List;

public class FindPermutation {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(140);
        numbers.add(50);
        permutation(numbers);
        permutation2(numbers);
    }

    private static void permutation(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                System.out.print(nums.get(i) + "");
                System.out.println(nums.get(j));

            }

        }
    }

    private static void permutation2(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (i != j) {
                    System.out.print(nums.get(i) + "");
                    System.out.println(nums.get(j));

                }

            }
        }


    }
}

