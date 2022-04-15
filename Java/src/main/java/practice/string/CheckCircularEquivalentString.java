package practice.string;

// https://www.geeksforgeeks.org/a-program-to-check-if-strings-are-rotations-of-each-other/
public class CheckCircularEquivalentString {

    boolean checkEqual(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        int i = 0;
        int j = 0;

        while (i < s1.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j = (j + 1) % s2.length();
            }

            else {
                if (i == 0) {
                    j = (j + 1) % s2.length();
                }
                else
                    i = 0;
            }

            if (i == 0 && j == 0)
                return false;
        }

        return true;
    }

    public CheckCircularEquivalentString() {
        System.out.println("##############################");
        System.out.println("Check two strings are circular equivalent");

        System.out.println("Pass: " + (checkEqual("abba", "bbaa") == true));
        System.out.println("Pass: " + (checkEqual("abba", "abab") == false));
        System.out.println("Pass: " + (checkEqual("helloworld", "lloworldhe") == true));
        System.out.println("Pass: " + (checkEqual("abba", "abba") == true));
        System.out.println("Pass: " + (checkEqual("abba", "abb") == false));

        System.out.println("##############################");
    }
}
