package com.company;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        float x = console.nextFloat();
        int y = Math.round(x);
        System.out.println(y);
    }
}