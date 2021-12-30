package ru.skypro;

public class Main {

    public static void main(String[] args) {

        task1();
        task2();
        task3();

    }

    public static void task1() {


        int i = 1;

        while (i <= 10) {
            System.out.print(" " + i);
            i++;
        }
        System.out.println();


        for (i = 10; i <= 10; i--) {
            if (i >= 1) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }


    public static void task2() {


        for (int i = 3; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
    }


    public static void task3() {

        int ourPeriod = 200;
        int nextPeriod = 100;
        int total = ourPeriod + nextPeriod;

        for (int i = 79; i < total; i += 79) {
            System.out.println(i);
        }
    }


}

