package org.example;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "C", "D", "E", "F", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"};
        Map<String, Integer> map = new HashMap<>();
        for(String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue()+ " | " );
        }
        System.out.println();


        Set<String> set = new HashSet<>(Arrays.asList(arr));
        System.out.println("Уникальные значения: "+set);



        PhoneBook<String,String> phBk = new PhoneBook<>("Home");
        phBk.add("A", "+93935392359");
        phBk.add("B", "+25446343324");
        phBk.add("C", "+12142642359");
        phBk.add("A", "+12191392359");
        phBk.add("A", "+45433664359");

        phBk.get("A");
    }
}