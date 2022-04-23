package practice.string;

// https://www.geeksforgeeks.org/count-of-different-numbers-divisible-by-3-that-can-be-obtained-by-changing-at-most-one-digit/
public class CountDiffDivisibleBy3 {

    static int getCount(String S) {

        if (S == null || S.isEmpty())
            return 0;

        int sum = 0;
        int cnt = 0;
        int len = S.length();
        for (int i = 0; i < len; i++) {
            sum += S.charAt(i);
        }

        if (sum % 3 == 0)
            cnt++;

        for (int i = 0; i < len; i++) {
            int tempSum = sum - (S.charAt(i) - 48);
            for (int j = 0; j < 10; j++) {
                if ((((tempSum + j) % 3) == 0) && j != (S.charAt(i) - 48)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public CountDiffDivisibleBy3() {
        System.out.println("######################################");
        System.out.println("Count Different Number Divisible By 3");

        String N= "0081";
        System.out.println(getCount(N));

        N= "23";
        System.out.println(getCount(N));

        N= "";
        System.out.println(getCount(N));

        System.out.println("######################################");
    }
}
