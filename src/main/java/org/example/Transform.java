package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Transform {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        names.add("shikha");
        names.add("anu");
        names.add("ani");
        names.add("mamta");
        names.add("pankaj");
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(transform(names));
        System.out.println(transformnumber(numbers));
    }
    private static List<String> transform(List<String> strs) {
        List<String> result = new ArrayList<>();
        for(String str: strs) {
            String name = str.toUpperCase();
            result.add(name);
        }
        return result;
    }
    private static  List<Integer> transformnumber(List<Integer> nums){
        List<Integer> result= new ArrayList<>();
        for(Integer num: nums)  {
            Integer multi =num + 2;
            result.add(multi);
            }
        return result;
        }
    }

