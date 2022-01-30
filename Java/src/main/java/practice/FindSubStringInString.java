package practice;

// https://www.geeksforgeeks.org/check-string-substring-another/
public class FindSubStringInString {

    private int strstr(String s, String x) {

        if(s.length() < x.length()) {
            return -1;
        }

        int i =0, counter = 0;
        int startIndex = -1;

        while (i < s.length() && counter < x.length()) {
            if (s.charAt(i) == x.charAt(counter)) {
                if (startIndex == -1)
                    startIndex = i;
                i++;
                counter++;
            }

            else {
                i = i - counter + 1;
                counter = 0;
                startIndex = -1;
            }
        }

        if (!s.startsWith(x, startIndex))
            return -1;

        return startIndex;
    }

    public FindSubStringInString() {
        System.out.println("##############################");
        System.out.println("Find sub-string in a String");

        String S = "aaaaab";
        String X = "aaab" ;
        System.out.println("S: " + S + " X: " + X + ": First Index: " + strstr(S, X));

        S = "geeksfffffoorrfoorforgeeks";
        X = "for";
        System.out.println("S: " + S + " X: " + X + ": First Index: " + strstr(S, X));

        System.out.println("##############################");
    }
}
