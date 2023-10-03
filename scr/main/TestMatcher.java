package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMatcher {
    public static void main(String[] args) {
        String text = "Конечно же, в постоянном репертуаре много спектаклей по произведениям «\"Булгакова\"».";
        String search = "же";

//        String test = text.replaceAll("\\p{Punct}", " ");
//        System.out.println(test);
        StringTokenizer st = new StringTokenizer(text, " \t\n\r,.?!\"«»", true);
        while (st.hasMoreTokens()) {
            // Выводим лексемы в консоль
            System.out.println(st.nextToken());
        }
        String quoted = Pattern.quote(search);
        Pattern pattern = Pattern.compile(quoted);
        Matcher matcher = pattern.matcher(text);
        System.out.println(text.matches(Pattern.quote(search)));
        System.out.println(matcher.find());
        System.out.println(text);
        ArrayList<String> list = new ArrayList<>(Arrays.asList(text.split("\\P{L}+")));
        System.out.println(list);
        StringBuffer stringBuffer = new StringBuffer();
        String firstChar = search.substring(0,1);



        String searchFirstUpper = search.replaceFirst( firstChar, firstChar.toUpperCase());




        String searchUppercase = search.toUpperCase();
        for (String str : list) {
            if (str.equals(search)) {
                stringBuffer.append("<b>").append(search).append("</b> ");
            } else if (str.equals(searchFirstUpper)) {
                stringBuffer.append("<b>").append(searchFirstUpper).append("</b> ");
            } else if (str.equals(searchUppercase)) {
                stringBuffer.append("<b>").append(searchUppercase).append("</b> ");
            } else {
                stringBuffer.append(str).append(" ");
            }
        }
        System.out.println(stringBuffer);

    }
}
