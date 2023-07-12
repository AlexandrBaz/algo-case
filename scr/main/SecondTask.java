package main;

public class SecondTask {
    public static void main(String[] args) {
        String str = "Learn Java";
        char[] symbols = str.toCharArray();
        for(int x=symbols.length-1; x>=0; x--){
            System.out.print(symbols[x]);
        }
    }
}