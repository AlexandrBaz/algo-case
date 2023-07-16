package main;

import java.util.Scanner;

public class NineTask {

    static int var = 2;
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            checkIsItANaturalNumber(n);
        }
        private static void checkIsItANaturalNumber(int n) {
            if (n > 1) {
                if (n % var != 0) {
                    var++;
                    System.out.println(n + " " + var + " success");
                    checkIsItANaturalNumber(n);
                } else if (n % var == 0) {
                    System.out.println(n + " " + var + " Error");
                    printIsItNaturalNumber(var, n);
                }
            }
        }
        private static void printIsItNaturalNumber(int var, int n) {
            if (var == n) {
                System.out.println(n + " is a natural number." + var + " " + n);
            } else {
                System.out.println(n + " is not a natural number.");
            }
        }

}