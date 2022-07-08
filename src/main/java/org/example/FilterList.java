package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FilterList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        List<String> names = new ArrayList<>();
        names.add("anu");
        names.add("shikha");
        names.add("mamta");
        names.add("pankaj");
        names.add("ani");
        System.out.println(filter(numbers, 50));
        System.out.println(FilterList(names, 5));
        System.out.println(filterbycharacter(names, "a"));
        System.out.println(filterbyname(names, "a"));
        System.out.println(filterbychara(names, "p"));
    }

        private static List<Integer> filter(List<Integer> nums,Integer key) {
        List<Integer> results = new ArrayList<>();
            for (int i = 0; i <nums.size() ; i++) {
                Integer num = nums.get(i);
                if(num< key) {
                    results.add(num);
                }

            }
            return results;
        }

        private static List<String> FilterList(List<String> names, Integer key){
          List<String> result = new ArrayList<>();
          for (String name : names) {
                if(name.length() >=key) {
                    result.add(name);
                }
                }
                return result;
            }
         private static List<String> filterbyname(List<String> names, String key){
         List<String>result = new ArrayList<>();
             for (String name : names) {
                 Boolean result1 = name.startsWith(key);
                 if(result1){
                     result.add(name);
                 }
             }
             return result;

        }
    private static  List<String> filterbychara(List<String> names, String key){
        List<String> results = new ArrayList<>();
        for (String name : names) {
            if(name.startsWith(key)){
                results.add(name);
            }
        }
        return results;
    }





    private static  List<String> filterbycharacter(List<String> names, String key){
        List<String> results = new ArrayList<>();
            for (String name : names) {
                if(name.endsWith(key)){
                    results.add(name);
                }
            }
            return results;
        }




}
