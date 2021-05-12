package com.company;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите общее количество учеников");
        int n = console.nextInt(); // общее количество учеников
        System.out.println("Введите процент учеников с массой тела < 30 кг");
        int z = console.nextInt(); // процент учеников с массой тела < 30 кг
        int x = (n * z / 100); // количество учеников с массой тела < 30 кг
        int y = (n * (100 - z) / 100); // количество учеников с массой тела > 30 кг
        int a = 1; // пирожок
        double b = 200; // молоко
        System.out.println((x * 2 * a + y * a) + " " + "пирожков");
        System.out.println(Math.ceil((b * x) / 900) + " " + "пакетов молока");

    }
}