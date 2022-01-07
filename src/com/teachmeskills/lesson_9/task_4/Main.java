package com.teachmeskills.lesson_9.task_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String test = "His radiation level is very low";
        String[] testArray = test.replace(",", "").split(" ");

        System.out.println("Your line is: " + test);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of word: ");
        int number = sc.nextInt();
        sc.close();

        if (number > testArray.length) {
            System.out.println("Wrong number of word!");
        } else {
            StringBuffer stringBuffer = new StringBuffer(testArray[number]);
            stringBuffer.reverse();

            if (testArray[number].equals(stringBuffer.toString())) {
                System.out.println("Yes! This word is a palindrome");
            } else {
                System.out.println("No! This word is not a palindrome");
            }
        }
    }
}
