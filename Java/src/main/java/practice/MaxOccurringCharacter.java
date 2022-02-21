package practice;

//https://www.geeksforgeeks.org/return-maximum-occurring-character-in-the-input-string/
public class MaxOccurringCharacter {

    String getMaxOccuringCharacter(String S) {
        int[] occurrences = new int[26];
        for (char ch : S.toCharArray()) {
            occurrences[ch - 'a']++;
        }

        char best_char = 'a';
        int  best_res  = 0;

        for (int i = 1; i < 26; i++) {
            if (occurrences[i] > best_res) {
                best_char = (char)((int)'a' + i);
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

        System.out.println("######################################");
    }
}
