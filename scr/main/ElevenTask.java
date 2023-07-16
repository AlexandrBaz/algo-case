package main;

import java.util.Scanner;

public class ElevenTask {
    public static void main(String[] args) {
        int number, prev, next = 0, sumPrevNext = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of values");
        number = scanner.nextInt();
        for (int i = 0; i <= number; i++){
            prev = next;
            next = sumPrevNext;
            sumPrevNext = prev + next;
            System.out.print(prev + ", ");
        }
    }
}