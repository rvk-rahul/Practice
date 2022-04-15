package practice.string;

// https://www.geeksforgeeks.org/return-maximum-occurring-character-in-the-input-string/
// https://practice.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1#
public class MaxOccurringCharacter {

    String getMaxOccuringCharacter(String line) {
        int[] occurrences = new int[26];
        for (char ch : line.toCharArray()) {
            occurrences[ch - 'a']++;
        }

        char best_char = 'a';
        int  best_res  = 0;

        for (int i = 0; i < 26; i++) {
            if (occurrences[i] > best_res) {
                best_char = (char)((int)'a'  + i);
                best_res  = occurrences[i];
            }
        }

        return Character.toString(best_char);
    }

    public MaxOccurringCharacter() {

        System.out.println("######################################");
        System.out.println("Max Occurring Character");

        String S = "aaabcbabazzzzzz";
        System.out.println(getMaxOccuringCharacter(S));

        S = "bcdefghij";
        System.out.println(getMaxOccuringCharacter(S));

        S = "aaabbbbaabkjhfasfnkznhnpwehrfjhalshdfzbxvnbasghjdfuawherf";
        System.out.println(getMaxOccuringCharacter(S));

        S = "abcdefabcdef";
        System.out.println(getMaxOccuringCharacter(S));

        System.out.println("######################################");
    }
}
