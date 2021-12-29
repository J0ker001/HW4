package ru.skypro;

public class Main {

    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }

    public static void task1() {


        for (int i = 1; i < 11; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        int i = 11;
        while (i > 1) {
            i--;
            System.out.print(" " + i);
        }
        System.out.println();
    }


    public static void task2() {


        for (int i = 3; i < 32; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
    }


    public static void task3() {

        int ourPeriod = 200;
        int nextPeriod = 100;
        int total = ourPeriod + nextPeriod;

        for (int i = 0; i < total; i += 79) {
            System.out.println(i);
        }
    }

}

