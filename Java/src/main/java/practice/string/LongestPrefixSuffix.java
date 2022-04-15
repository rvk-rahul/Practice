package practice.string;

// https://www.geeksforgeeks.org/longest-prefix-also-suffix/
// Overlap is allowed
public class LongestPrefixSuffix {

    private int lps(String s) {

        if (s.length() <= 1)
            return 0;

        int[] mat = new int[s.length()];
        int i = 0, j = 1;
        while(j < s.length())
        {
            if(s.charAt(j) == s.charAt(i))
            {
                mat[j] = i+1;
                i++;
                j++;
            }
            else
            {
                if(i==0)
                    j++;
                else
                    i = mat[i-1];

            }
        }

        return mat[s.length()-1];
    }

    public LongestPrefixSuffix() {
        System.out.println("##############################");
        System.out.println("Longest Prefix Suffix");
        String S = "yycgicgyyycg";
        System.out.println("S: " + S + " Length of lps: " + lps(S));
        S = "";
        System.out.println("S: " + S + " Length of lps: " + lps(S));

        System.out.println("##############################");
    }

}
