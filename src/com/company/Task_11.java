package com.company;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество сукунд");
        int a = console.nextInt();
        int b = a / 86400;
        int c = ((a % 86400) / 3600);
        int d = (((a % 86400) % 3600) / 60);
        int e = ((((a % 86400) % 3600) % 60));

        System.out.println(b + " " + "дней");
        System.out.println(c + " " + "часов");
        System.out.println(d + " " + "минут");
        System.out.println(e + " " + "секунд");
    }
}