package com.company;

public class Task_07 {
    public static void main(String[] args) {
        double a = 7.5; // процент
        int b = 10000; // сумма вклада
        int c = 2; // года
        double x = b + (b * a) / 100 * c;

        System.out.format("%.2f", x);
    }
}