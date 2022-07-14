package org.example;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    public static void main(String[] args) {
        List<String> vegetables = new ArrayList<>();
        vegetables.add("potato");
        vegetables.add("tomato");
        vegetables.add("brinjal");
        vegetables.add("raddish");
        vegetables.add("Onion");
        combination(vegetables);
    }
    private static void combination(List<String> strs){
        for (int i = 0; i < strs.size() ; i++) {
            for (int j = j + i; j < strs.size() ; j++) {
                System.out.println(strs.get(i) + "");
                System.out.println(strs.get(j));

            }

        }
    }
}
