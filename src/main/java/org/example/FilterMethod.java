package org.example;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class FilterMethod {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("pear");
        fruits.add("papaya");
        fruits.add("kiwi");
        fruits.add("watermelon");
        String result = printLongest(fruits);
        out.println(result);
        String minimum =printSmallest(fruits);
        out.println(minimum);
//        String len = printLength(fruits, args.length );
//        out.println(len);

    }

    private static String printLongest(List<String> strs) {
        String max = strs.get(0);
        for (int i = 0; i < strs.size(); i++) {
            if (strs.get(i).length() > max.length()) {
                max = strs.get(i);
            }
            //System.out.println(strs.get(i).length());
        }
        //System.out.println(max);
        return max;

    }

    private static String printSmallest(List<String> strs) {
        String mini = strs.get(0);
        for (int i = 0; i < strs.size(); i++) {
            if (strs.get(i).length()  < mini.length()) {
                mini = strs.get(i);
            }
        }
        return mini;
    }

//    private static String printLength(List<String> strs, Integer length) {
//        String maxString = strs.get(0);
//        int length = strs.get(0).length();
//        for (int i = 0; i < strs.size(); i++) {
//            String currentString= strs.get(i);
//            if(length < maxString){
//                length =maxString ;
//                result = cuurentString;
//        }
//            }
//        return maxString;
//        }
}


