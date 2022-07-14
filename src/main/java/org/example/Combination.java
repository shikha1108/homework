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
        for (int i = 0; i < strs.size() ; i = i + 1) {
            for (int j =  i+ 1; j < strs.size() ; j++) {
                System.out.print(strs.get(i) + " ");
                System.out.println(strs.get(j));

            }

        }
    }
}
