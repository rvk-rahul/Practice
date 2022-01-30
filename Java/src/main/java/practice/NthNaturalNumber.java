package practice;

// https://www.geeksforgeeks.org/nth-natural-number-after-removing-all-numbers-consisting-of-the-digit-9/
public class NthNaturalNumber {

    private static long findNth(long N) {

        long res = 0;

        long rem;
        long i = 1;
        while(N > 0) {
            rem = N % 9;
            res = rem * i + res;
            N = N / 9;
            i *= 10;
        }
        return res;
    }

    public NthNaturalNumber() {
        System.out.println("##############################");
        System.out.println("Nth natural number removing numbers with digit as 9");
        long N = 10000021409l;
        System.out.println("N: " + N + " Equals: " + findNth(N));

        System.out.println("##############################");
    }
}
