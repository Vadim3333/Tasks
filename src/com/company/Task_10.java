package com.company;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите рост, см");
        final int height = console.nextInt();
        System.out.println("Введите вес, кг");
        final int weight = console.nextInt();
        int y = height - weight; // соотношение
        if (y - 110 > 0) {
            System.out.println("нужно набрать" + " " + (y - 110) + " " + "кг");
        } else if (y - 110 < 0) {
            System.out.println("нужно сбросить" + " " + (110 - y) + " " + "кг");

        } else {
            System.out.println("у вас идеальное соотношение");
        }
    }
}