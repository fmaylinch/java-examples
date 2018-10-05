package tech.bts.javaexamples.classes.util;

public class MathUtil {

    public static double power(double base, double exponent) {

        double result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }

    public static double factorial(double n) {

        double result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
