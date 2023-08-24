package org.launchcode;


import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to count?");

        String testString = input.nextLine().toLowerCase();

        HashMap<Character, Integer> letters = new HashMap<>();
        for(char letter: testString.toCharArray()) {
            if (Character.isLetter(letter)) {
                if (letters.containsKey(letter)) {
                    letters.put(letter, letters.get(letter) + 1);
                } else {
                    letters.put(letter, 1);
                }
            }
        }
        for(Map.Entry<Character, Integer> item: letters.entrySet()){
            System.out.println(item.getKey() + ": " + item.getValue());
        }
    }
}