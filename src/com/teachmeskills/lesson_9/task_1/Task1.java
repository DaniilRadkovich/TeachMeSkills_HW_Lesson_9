package com.teachmeskills.lesson_9.task_1;

public class Task1 {


    public static void firstTask(String test) {
        String result = test.substring(0, 4) + test.substring(9, 13);
        System.out.println(result);
    }

    public static void secondTask(String test, String replace1, String replace2) {
        StringBuilder sb = new StringBuilder(test);
        sb.replace(5, 8, replace1);
        sb.replace(14, 17, replace2);
        System.out.println(sb);
    }

    public static void thirdTask(String test) {
        StringBuilder sb = new StringBuilder(test.substring(5, 8) + "/" + test.substring(14, 17) + "/" + test.substring(19, 20) + "/" + test.substring(21, 22));
        System.out.println(sb.toString().toLowerCase());
    }

    public static void fourthTask(String test) {
        StringBuilder sb = new StringBuilder(test.substring(5, 8) + "/" + test.substring(14, 17) + "/" + test.substring(19, 20) + "/" + test.substring(21, 22));
        System.out.println("Letters:" + sb.toString().toUpperCase());
    }

    public static void fifthTask (String test){
        int num1 = test.indexOf("abc");
        int num2 = test.indexOf("ABC");
        if (num1 == -1 && num2 == -1){
            System.out.println("No such sequence find!");
        }
        else {
            System.out.println("In this line there is such sequence!");
        }
    }

    public static void sixthTask(String test){
        boolean bool = test.startsWith("555");
        if (bool){
            System.out.println("This line starts with 555");
        }
        else {
            System.out.println("No 555 find!");
        }
    }

    public static void seventhTask(String test){
        boolean bool = test.endsWith("1a2b");
        if (bool){
            System.out.println("This line ends with 1a2b");
        }
        else {
            System.out.println("No 1a2b find!");
        }
    }
}
