package main;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your words");
        str = scanner.nextLine();
        String [] temp = str.split("");
        for (int x = temp.length-1; x >= 0; x--){
            System.out.print(temp[x]);
        }
    }

}