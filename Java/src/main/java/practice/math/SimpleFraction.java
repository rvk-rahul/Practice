package practice.math;

import java.util.HashMap;
import java.util.Map;

// https://www.geeksforgeeks.org/represent-the-fraction-of-two-numbers-in-the-string-format/
public class SimpleFraction {

    private String getDecimal(int numerator, int denominator) {

        if (numerator == 0 && denominator != 0)
            return "0";

        if (denominator == 0)
            return "undefined";

        StringBuilder result = new StringBuilder();

        if (numerator < 0 ^ denominator < 0)
            result.append("-");

        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);

        long quotient = numerator / denominator;
        result.append(quotient);
        long remainder = (long)(numerator % denominator) * 10;

        if (remainder == 0)
            return result.toString();

        result.append(".");
        Map<Long, Integer> map = new HashMap<>();

        while (remainder != 0) {

            if (map.containsKey(remainder)) {
                int index = map.get(remainder);

                String string1 = result.substring(0, index);
                String string2 = result.substring(index, result.length());

                return string1 + "(" + string2 + ")";

            }

            map.put(remainder, result.length());
            quotient = remainder / denominator;
            result.append(quotient);
            remainder = (remainder % denominator) * 10;
        }

        return result.toString();

    }

    public SimpleFraction() {

        System.out.println("######################################");
        System.out.println("Simple Fraction");

        int numerator = 1, denominator = 3;
        System.out.println(numerator + "/" + denominator + ": " + getDecimal(numerator, denominator));

        numerator = 113;
        denominator = 56;
        System.out.println(numerator + "/" + denominator + ": " + getDecimal(numerator, denominator));

        numerator = 5;
        denominator = 2;
        System.out.println(numerator + "/" + denominator + ": " + getDecimal(numerator, denominator));

        numerator = 100;
        denominator = 5;
        System.out.println(numerator + "/" + denominator + ": " + getDecimal(numerator, denominator));

        numerator = -100;
        denominator = 6;
        System.out.println(numerator + "/" + denominator + ": " + getDecimal(numerator, denominator));

        System.out.println("######################################");

    }
}
