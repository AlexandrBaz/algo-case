package main;

import java.util.Scanner;

public class FiveTask {
    public static void main(String[] args) {
        int a, b, temp;
        System.out.println("Enter values");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Value before reverse " + a + " " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("Value after reverse " + a + " " +b);
    }
}