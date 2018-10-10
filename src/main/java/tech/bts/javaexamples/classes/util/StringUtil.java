package tech.bts.javaexamples.classes.util;

public class StringUtil {

    /**
     * Returns a string made of `s` repeated `n` times.
     * For example: repeat("go", 3) returns "gogogo".
     */
    public static String repeat (String s, int n) {

        String result = "";
        for (int i = 1; i <= n; i++) {
            result += s;
        }
        return result;
    }

    /** Returns a string containing `s` plus spaces to the left so the resulting string has length `n` */
    public static String padLeft (String s, int n) {

        return repeat(" ", n - s.length()) + s;
    }

    /** Returns a string containing `s` plus spaces to the right so the resulting string has length `n` */
    public static String padRight (String s, int n) {

        return s + repeat(" ", n - s.length());
    }

}