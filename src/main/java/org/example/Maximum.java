package org.example;

import java.util.ArrayList;
import java.util.List;

public class Maximum {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        Integer result = (maximum(numbers));
        System.out.println(result);
        numbers.remove(result);
        System.out.println(maximum(numbers));
        Integer result1 =(maximum(numbers));
        System.out.println(result1);
        //System.out.println(maximum(numbers));
        System.out.println(maximum(numbers));
    }
    private static Integer maximum(List<Integer> nums) {
        Integer max =nums.get(0);
        for (Integer num : nums) {
            if(num > max){
                max =  num;
            }
        }
        return max;
    }
}
