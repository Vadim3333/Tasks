package com.company;

import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x = console.nextDouble();
        double y = Math.round(x);
        if (x - y == 0) {
            System.out.println("Целое");
        } else {
            System.out.println("Вещественное");
        }
    }
}