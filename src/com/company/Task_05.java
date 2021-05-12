package com.company;

public class Task_05 {
    public static void main(String[] args) {
        final int R = 7;
        double P = 3.14;
        double a = 2 * P * R;
        double b = P * R * R;


        System.out.println("Длина окружности" + " " + Math.round(a));
        System.out.println("Площадь окружности" + " " + Math.round(b));

    }
}