package com.teachmeskills.lesson_9.task_2;

public class Task2 {
    public static void main(String[] args) {

        String test = "Two cars are always ready to chase each other";
        String[] array = test.replace(",", "").split(" ");

        String shortestWord = array[0];
        String longestWord = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() <= shortestWord.length()) {
                shortestWord = array[i];
            } else {
                if (array[i].length() > longestWord.length()) {
                    longestWord = array[i];

                }
            }
        }
        System.out.println("The shortest word is: " + shortestWord);
        System.out.println("The longest word is: " + longestWord);


    }
}
