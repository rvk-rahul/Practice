package practice.string;

import java.util.Arrays;
import java.util.List;

// https://www.geeksforgeeks.org/reverse-words-in-a-given-string/
public class ReverseWordsInAString {

    private String reverseWords(String S) {

        List<String> words = Arrays.asList(S.split("\\."));

        String res = "";

        for (int i = words.size() - 1; i >= 0; i--) {
            if (i == 0)
                res = res + words.get(0);

            else
                res = res + words.get(i) + ".";
        }

        return res;
    }

    public ReverseWordsInAString() {
        System.out.println("######################################");
        System.out.println("Reverse words in a given string");
        String s = "i.like.this.program.very.much";
        System.out.println(reverseWords(s));
        System.out.println("######################################");
    }
}
