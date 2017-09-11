package utils;

public class Utils {
    private Utils() {}

    // A basic implementation of the isPrime method - probably super inefficient
    public static boolean isPrime(Long num) {
        if (num == 2L) return true;
        if (num == 1L) return false;
        if (num % 2 == 0) return false;
        long start = 3;
        long end = new Double(Math.sqrt(num)).longValue();
        for (long i = start; i <= end; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
