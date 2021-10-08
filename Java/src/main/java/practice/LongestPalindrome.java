package practice;

public class LongestPalindrome {

    private static boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j-- ) {
            if (str.charAt(i) != str.charAt(j))
                return false;
        }
        return true;
    }

    private static void getN3Solution(String [] strArr) {

        for (String str: strArr) {
            int maxLength = 1;
            for (int i = 0; i < str.length(); i++) {
                for (int j = i; j < str.length() + 1; j++) {
                    if (isPalindrome(str.substring(i,j)))
                        if (maxLength < (j - i))
                            maxLength = j - i;
                }
            }
            System.out.println("String: "+ str + " Max Length of Palindrome: "+ maxLength);
        }
    }

    private static void getN2Solution(String [] strArr) {
        for (String str : strArr) {
            int maxLength = 1;

            // Consider each element as center and check palindrome by extending the window both side (time O(n^2) space O(1))
            for (int i = 1; i < str.length(); i++) {
                // even case
                int low = i - 1;
                int high = i;
                for (;low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high); low--, high++) {
                }
                low++;
                high--;
                int currLength = high - low + 1;
                if (str.charAt(low) == str.charAt(high) && currLength > maxLength)
                    maxLength = currLength;

                // odd case
                low = i - 1;
                high = i + 1;
                for (;low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high); low--, high++){
                }
                low++;
                high--;
                currLength = high - low + 1;
                if (str.charAt(low) == str.charAt(high) && currLength > maxLength)
                    maxLength = currLength;
            }
            System.out.println("String: " + str + " Max Length of Palindrome: " + maxLength);
        }
    }

    public LongestPalindrome() {
        String[] strArr = new String[]{"abba", "abbababba", "babcbaabcbaccba", "cdbabcbabdab", };
        System.out.println("##########################################");
        System.out.println("Longest Palindrome Substring:");
//        getN3Solution(strArr);
        getN2Solution(strArr);
        System.out.println("##########################################");
    }
}
