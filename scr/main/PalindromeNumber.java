package main;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(223));
        System.out.println(-127);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long reverse  = 0;
        long temp = x;
        while (temp != 0) {
            int number = (int) temp % 10;
            reverse = reverse * 10 + number;
            temp /= 10;
        }
        return (reverse == x);
    }
}