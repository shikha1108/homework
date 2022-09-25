package org.example;

import java.util.ArrayList;
import java.util.List;

public class FilterTest {
    public static void main(String[] args) {
        List<String> veges = new ArrayList<>();
        veges.add("potato");
        veges.add("onion");
        veges.add("pear");
        veges.add("brinjals");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println(filternumber(numbers, 40));
        System.out.println(filterlist(veges, 4));
        System.out.println(filtercharacter2(veges, "o"));
        System.out.println(Filtercharacter(veges, "o"));

    }
    private static List<Integer> filternumber(List<Integer> nums, Integer key){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            Integer num = nums.get(i);
            if(num< key){
                result.add(num);
            }
        }
        return result;
    }
    private static List<String> filterlist(List<String> strs, Integer key){
        List<String> result = new ArrayList<>();
        for(String num: strs){
            if(num.length() >= key){
                result.add(num);
            }
        }
        return result;
    }
    private static List<String> Filtercharacter(List<String> strs, String key) {
        List<String> result = new ArrayList<>();
        for (String str : strs) {
            if(str.startsWith(key)){
                result.add(str);
            }
        }
        return result;
    }
    private static List<String> filtercharacter2(List<String> strs, String key){
        List<String> result = new ArrayList<>();
        for (String str : strs) {
            if(str.endsWith(key)){
                result.add(str);
            }
        }
        return result;
    }
}
