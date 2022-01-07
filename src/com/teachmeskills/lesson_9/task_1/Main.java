package com.teachmeskills.lesson_9.task_1;

import static com.teachmeskills.lesson_9.task_1.Task1.*;

public class Main {

    public static void main(String[] args) {

        String test = "1234-ABC-5678-kek-1a2b";
        System.out.println("Your document number: " + test);
        firstTask(test);
        secondTask(test, "xxx", "yyy");
        thirdTask(test);
        fourthTask(test);
        fifthTask(test);
        sixthTask(test);
        seventhTask(test);
    }
}
