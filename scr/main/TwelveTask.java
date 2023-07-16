package main;

import java.util.ArrayList;
import java.util.Iterator;

public class TwelveTask {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(60);
        list.add(70);
        System.out.println("Iterator");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Improved cycle for");
        for (Integer integer : list){
            System.out.println(integer);
        }
        System.out.println("for loop");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}