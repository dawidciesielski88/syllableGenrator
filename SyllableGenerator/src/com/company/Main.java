package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
//public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> vowel = new ArrayList<String>();

        vowel.add("A");
        vowel.add("E");
        vowel.add("I");
        vowel.add("O");
        vowel.add("U");
        vowel.add("Y");

        ArrayList<String> constant = new ArrayList<String>();
        constant.add("M");
        constant.add("T");
        constant.add("L");
        constant.add("K");
        constant.add("S");
        constant.add("C");
        constant.add("F");
        Random anotherRandom = new Random();

        for (int i = 0; i < constant.size(); i++) {
            constant.get(anotherRandom.nextInt(vowel.size()));
        }
//        String constant[] = {"B","C","D","F", "G", "H", "J", "K", "L"};

//        System.out.println("Enter your constant: ");
//        String syllable = scanner.next();

        Random random = new Random();

        for (int i = 0; i < vowel.size(); i++) {
            vowel.get(random.nextInt(vowel.size()));

        }
        System.out.println(constant.get(anotherRandom.nextInt(vowel.size())) + vowel.get(random.nextInt(vowel.size())));
    }
}
