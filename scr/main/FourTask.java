package main;

import java.util.Scanner;

public class FourTask {
    public static void main(String[] args) {
        String str;
        StringBuilder reverseStr = new StringBuilder();
        System.out.println("Enter words");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        for (int x = str.length()-1; x>=0; x--){
            reverseStr.append(str.charAt(x));
        }
        System.out.println(reverseStr);
    }
}