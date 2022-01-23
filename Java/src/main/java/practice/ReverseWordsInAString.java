package practice;

// https://www.geeksforgeeks.org/reverse-words-in-a-given-string/
public class ReverseWordsInAString {

    private static String reverseWords(String S) {

        StringBuilder res = new StringBuilder();
        int j = S.length();
        for (int i = S.length() - 1; i >=0 ; i--) {
            if (S.charAt(i) == '.') {
                res.append(S, i + 1, j);
                res.append(".");
                j = i;
            }
        }
        res.append(S, 0, j);

        return res.toString();
    }

    public ReverseWordsInAString() {
        System.out.println("######################################");
        System.out.println("Reverse words in a given string");
        String s = "i.like.this.program.very.much";
        System.out.println(reverseWords(s));
        System.out.println("######################################");
    }
}
