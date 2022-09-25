package org.example;

import java.util.HashMap;
import java.util.Map;

public class AlphabetCount {
    public static void main(String[] args) {
        String text = "hey i want something different please help me as soon as possible";

        System.out.println(countsWord(text));
        System.out.println(countsAlphabets(text));
        System.out.println(countsAlphabetCase(text));


    }
    private static Integer countsWord(String text) {
        String[] words = text.split(" ");
        Integer result = words.length;
        return result;
    }
    private static Map<String, Integer> countsAlphabets(String text){
        Map<String, Integer> countMap = new HashMap<>();
        String[] words = text.split(" ");
        for (String word : words) {
            if(countMap.containsKey(word)) {
                Integer old = countMap.get(word);
                countMap.put(word,old +2);
            }
            else {
                countMap.put(word,1);
            }
        }
        return countMap;
    }
    private static Map<Character, Integer> countsAlphabetCase(String text) {
        Map<Character, Integer> result = new HashMap<>();
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Character current = chars[i];
            if (result.containsKey(current)) {
                Integer old = result.get(current);
                result.put(current, old + 1);
            }
            else {
                result.put(current, 1);
            }
        }
        return result;
    }

}