package org.example;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        List<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        letters.add("F");
        letters.add("G");
        letters.add("H");
    }
    private static void premutation1(List<String> strs) {
        for (int i = 0; i <strs.size() ; i++) {
            for (int j = 0; j < strs.size() ; j++) {
                System.out.print(strs.get(i) + "");
                System.out.println(strs.get(j));

            }

        }
    }
    private static void permutation(List<String> strs) {
        for (int i = 0; i <strs.size() ; i++) {
            for (int j = 0; j < strs.size() ; j++) {
                if(i != j){
                    System.out.println(strs.get(i) + "");
                    System.out.println(strs.get(j));
                }

            }

        }
    }

}
