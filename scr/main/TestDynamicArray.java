package main;

public class TestDynamicArray {
    public static void main(String[] args) {
        int n = 5;
        int [] arrayNumber;
        arrayNumber = new int[n];
        arrayNumber[0] = 1;
        arrayNumber[1] = 2;
        arrayNumber[2] = 3;
        arrayNumber[3] = 4;
        arrayNumber[4] = 5;
        System.out.println(arrayNumber.length);
        if (arrayNumber[4] == 5){
            n = 10;
            System.out.println(arrayNumber.length);
        }
        for (int i = 0; i< arrayNumber.length; i++){
            System.out.println(i + " " + arrayNumber[i]);
        }
    }
}
