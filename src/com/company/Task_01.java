package com.company;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число x");
        int x = console.nextInt();
        System.out.println("Введите число y");
        int y = console.nextInt();
        System.out.println(x / y);
        System.out.println(x % y);
        System.out.println(Math.sqrt(x));
    }
}