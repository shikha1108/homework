package org.example;

import java.util.ArrayList;
import java.util.List;

public class Search {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);
        numbers.add(60);
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("papaya");
        fruits.add("pear");
        fruits.add("pomegranate");
        fruits.add("Kiwi");
        System.out.println(search(numbers, 90));
        System.out.println(search1(fruits, "apple"));
    }
    private static Boolean search(List<Integer> nums, Integer key) {
        Boolean result = false;
        for (Integer num : nums) {
            if(num ==key){
                result = true;
                break;
            }
        }
        return result;

    }
    private static Boolean search1(List<String> strs, String key){
        Boolean result1 = false;
        for (String str : strs) {
            if(str.equals(key)){
                result1 = true;
                break;
            }
        }
        return result1;
    }
}
