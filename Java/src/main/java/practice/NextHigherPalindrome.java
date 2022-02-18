package practice;

// https://www.geeksforgeeks.org/next-higher-palindromic-number-using-set-digits/
public class NextHigherPalindrome {

    private String nextPalin(String N) {

        if (N.length() <= 3) {
            return "-1";
        }

        int mid = N.length()/2;

        String halfString = N.substring(0, mid);

        String midChar = "";
        if (N.length() % 2 != 0) {
            midChar = N.substring(mid, mid + 1);
        }

        int i = halfString.length() - 1;
        for (; i >= 0; i--) {
            if (halfString.charAt(i) < halfString.charAt(i + 1)) {
                break;
            }
        }

        if (i < 0)
            return "-1";

        int smallest = i + 1;
        for (int j = i + 1; j < halfString.length(); j++) {
            if (halfString.charAt(i) < halfString.charAt(j) && halfString.charAt(j) < halfString.charAt(smallest)) {
                smallest = j;
            }
        }

        if (halfString.charAt(smallest) == halfString.charAt(i))
            return "-1";

        halfString = halfString.substring(0,i) + halfString.substring(smallest, smallest + 1) + halfString.substring(i + 1,smallest)
                + halfString.substring(i, i + 1)+ halfString.substring(smallest + 1);

        String newHalf = halfString.substring(0, i + 1) + revString(halfString.substring(i + 1));
        String res = newHalf + midChar + revString(newHalf);

        return res;
    }

    private String revString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.reverse().toString();
    }

    public NextHigherPalindrome() {
        System.out.println("##############################");
        System.out.println("Next higher palindromic number using the same set of digits");
        String N = "35453";
        System.out.println("N: " + N + " Next Palindrome: " + nextPalin(N));

        System.out.println("##############################");
    }
}
