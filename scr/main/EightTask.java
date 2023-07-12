package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EightTask {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "First");
        hashMap.put(2, "Second");
        hashMap.put(3, "Third");
        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        for (Map.Entry entry2 : hashMap.entrySet()){
            System.out.println(entry2.getKey() + " " + entry2.getValue());
        }
    }
}

//https://itvdn.com/ru/blog/article/test-java-20
//https://github.com/enhorse/java-interview/blob/master/java8.md#какие-конечные-методы-работы-со-стримами-вы-знаете