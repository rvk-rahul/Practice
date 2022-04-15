package practice.string;

import java.util.HashMap;
import java.util.Map;

// https://www.geeksforgeeks.org/converting-roman-numerals-decimal-lying-1-3999/
public class RomanNumberToInteger {

    int romanToDecimal(String str) {
        // code here
        if (str.length() == 0)
            return 0;

        Map<Character, Integer> romanIntMap = new HashMap<>();
        romanIntMap.put('I', 1);
        romanIntMap.put('V', 5);
        romanIntMap.put('X', 10);
        romanIntMap.put('L', 50);
        romanIntMap.put('C', 100);
        romanIntMap.put('D', 500);
        romanIntMap.put('M', 1000);

        int res = romanIntMap.get(str.charAt(str.length() - 1));
        int prev = res;
        for (int i = str.length() - 2; i >= 0; i--) {
            int curr = romanIntMap.get(str.charAt(i));
            if (curr < prev) {
                res -= curr;
            }
            else {
                res += curr;
            }
            prev = curr;
        }

        return res;
    }

    public RomanNumberToInteger() {
        System.out.println("######################################");
        System.out.println("Roman Number to Integer");
        String str = "XXXIX";
        System.out.println(str + ": " + romanToDecimal(str));
        str = "XCIX";
        System.out.println(str + ": " + romanToDecimal(str));
        System.out.println("######################################");
    }
}
