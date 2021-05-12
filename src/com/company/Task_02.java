package com.company;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите натуральное (целое) трехзначное число");
        int x = console.nextInt();
        int y = x / 100 + x / 10 % 10 + x % 10;
        System.out.println(y);
    }
}