package tech.bts.javaexamples.classes.util;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {

    static String repeatString (String s, int n) {

        String result = "";
        for (int i = 1; i <= n; i++) {
            result += s;
        }
        return result;
    }

    static String padLeft (String s, int n) {

        return repeatString(" ", n - s.length()) + s;
    }

    static String padRight (String s, int n) {

        return s + repeatString(" ", n - s.length());
    }

    static List<Integer> listOfNumbers (int start, int end) {

        List<Integer> result = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            result.add(i);
        }
        return result;
    }
}