package org.example;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("kiwi");
        fruits.add("blueberry");
        fruits.add("cherry");
        System.out.println(reverseMethod1(fruits));
        System.out.println(reverseMethod2(fruits));

    }
    private static List<String> reverseMethod1(List<String> strs) {
        List<String> newList = new ArrayList<>();
        for (String s : strs) {
            newList.add(0,s);
        }
        return newList;
    }

        private static List<String> reverseMethod2(List<String> strs) {
            List<String> newList = new ArrayList<>();
            for (int i = strs.size() - 1; i >= 0; i--) {
                String fruit = strs.get(i);
                newList.add(fruit);
            }
            return newList;
        }



    }
