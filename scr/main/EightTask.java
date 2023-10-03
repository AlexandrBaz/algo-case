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
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        for (Map.Entry<Integer, String> entry2 : hashMap.entrySet()){
            System.out.println(entry2.getKey() + " " + entry2.getValue());
        }
    }
}
