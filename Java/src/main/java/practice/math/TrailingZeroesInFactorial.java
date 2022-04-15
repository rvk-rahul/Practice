package practice.math;

// https://www.geeksforgeeks.org/count-trailing-zeroes-factorial-number/
public class TrailingZeroesInFactorial {

    private int getTrailingZeroesInFactorial(int n) {
        if (n <0 )
            return -1;

        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;

        return count;
    }

    public TrailingZeroesInFactorial() {
        System.out.println("##########################################");
        int n =2;
        System.out.println("n: " + n + " Trailing Zeroes: " + getTrailingZeroesInFactorial(n));
        n =5;
        System.out.println("n: " + n + " Trailing Zeroes: " + getTrailingZeroesInFactorial(n));
        n =10;
        System.out.println("n: " + n + " Trailing Zeroes: " + getTrailingZeroesInFactorial(n));
        n =28;
        System.out.println("n: " + n + " Trailing Zeroes: " + getTrailingZeroesInFactorial(n));
        n =105;
        System.out.println("n: " + n + " Trailing Zeroes: " + getTrailingZeroesInFactorial(n));
        System.out.println("##########################################");
    }

}
