package main;

import java.util.HashMap;

public class SevenTask {
    public static void main(String[] args) {
        String st = "Current task posted for Java developers developers";
        String [] words = st.split(" ");
        HashMap<String, Integer> keyValue = new HashMap<>();
        for (int i = 0; i <= words.length-1; i++){
            if(keyValue.containsKey(words[i])){
                int count = keyValue.get(words[i]);
                keyValue.put(words[i], count +1 );
            } else {
                keyValue.put(words[i], 1);
            }
        }
        System.out.println(keyValue);
    }
}