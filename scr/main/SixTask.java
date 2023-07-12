package main;

import java.util.Scanner;

public class SixTask {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter values");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Values before reverse " + a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Values after reverse " + a + " " + b);
    }
}