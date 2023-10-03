package main;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String str) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && map.get(str.charAt(i)) < map.get(str.charAt(i + 1))) {
                ans -= map.get(str.charAt(i));
                System.out.println(ans + " higher");
            } else {
                ans += map.get(str.charAt(i));
                System.out.println(ans + " lower");
            }
        }
        return ans;
    }
}