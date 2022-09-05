package listoflist;

import java.util.ArrayList;
import java.util.List;

public class fruits {


    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("papaya");
        fruits.add("kiwi");
        List<String> fruits1 = new ArrayList<>();
        fruits.add("watermelon");
        fruits.add("grape");
        fruits.add("melon");
        fruits.add("avacado");
        fruits.add("fig");
        List<String> fruits2 = new ArrayList<>();
        fruits.add("caneberry");
        fruits.add("rusberry");
        fruits.add("peach");
        fruits.add("mulberry");
        fruits.add("jujube");

        List<List<String>> listOfList = new ArrayList<>();
        listOfList.add(fruits);
        listOfList.add(fruits1);
        listOfList.add(fruits2);

        System.out.println(listOfList);

    }
}
