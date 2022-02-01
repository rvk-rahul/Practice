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
            for (int j = 0; j < res.length() - 1; j++) {
                if (j == res.length() -2) {
                    if (res.charAt(j) == res.charAt(j + 1)) {
                        count++;
                        tempRes += String.valueOf(count)+ res.charAt(j);
                    }
                    else {
                        tempRes += String.valueOf(count) + res.charAt(j);
                        tempRes += String.valueOf(1) + res.charAt(j + 1);
                    }
                }

                else if (res.charAt(j) == res.charAt(j + 1))
                    count++;

                else {
                    tempRes = tempRes + count + res.charAt(j);
                    count = 1;
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
