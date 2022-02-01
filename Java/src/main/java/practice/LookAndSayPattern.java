package practice;

public class LookAndSayPattern {

    String lookandsay(int n) {
        //your code here
        if (n == 1) {
            return "1";
        }

        String res = "11";

        for (int i = 3; i <= n; i++) {
            int count = 1;
            String tempRes = "";
            for (int j = 1; j < res.length(); j++) {
                if (res.charAt(j) == res.charAt(j - 1)) {
                    count++;
                }
                else {
                    tempRes = tempRes + count + res.charAt(j - 1);
                    count = 1;
                }
                if (j == res.length() - 1) {
                    tempRes = tempRes + count + res.charAt(j);
                }
            }
            res = tempRes;
        }

        return res;
    }

    public LookAndSayPattern() {
        System.out.println("##############################");
        System.out.println("Look And Say Pattern");
        int n = 30;
        System.out.println("n: " + n + " Pattern: " + lookandsay(n));
        System.out.println("##############################");
    }
}
