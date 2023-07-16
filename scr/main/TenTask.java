package main;

import java.util.Scanner;

public class TenTask {
    public static void main(String[] args) {
        String inputString;
        StringBuilder reverseString = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int stringLength;
        System.out.println("Enter word");
        inputString = scanner.nextLine();
        stringLength = inputString.length();
        for (int i = stringLength-1; i>=0; i--){
            reverseString.append(inputString.charAt(i));
        }
        System.out.println("Reverse string " + reverseString);
        if (inputString.contentEquals(reverseString)){
            System.out.println(inputString + " words is palindrome");
        } else {
            System.out.println("ups, its not palindrome");
        }
    }
}