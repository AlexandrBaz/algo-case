package main;

public class ThirteenTask {
    public static void main(String[] args) {
        int[] numArrays = {10, 15, 32, 100, 16, 11, 98, 36, 95, 33};
        int biggest = numArrays[0];
        int secondBiggest = numArrays[0];
        for (int i = 0; i < numArrays.length; i++) {
            System.out.print(numArrays[i] + ", ");
        }
        System.out.println("");
        for (int i = 0; i < numArrays.length; i++) {
            if (numArrays[i] > biggest) {
                secondBiggest = biggest;
                biggest = numArrays[i];
            } else if (numArrays[i] > secondBiggest && numArrays[i] != biggest) {
                secondBiggest = numArrays[i];
            }
        }
        System.out.println(secondBiggest + " it s second biggest number");
    }
}