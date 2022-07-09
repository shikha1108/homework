package org.example;

import java.util.ArrayList;
import java.util.List;

public class Maximum {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-10);
        numbers.add(-90);
        numbers.add(-80);
        numbers.add(-60);
        numbers.add(-50);
        System.out.println(maximum(numbers));
    }
    private static List<Integer> maximum(List<Integer> nums){
        Integer max = nums.get(0);
        for (Integer num: nums) {
            if(num > max){
                max =num;
            }
        }
        return max;
    }






}
