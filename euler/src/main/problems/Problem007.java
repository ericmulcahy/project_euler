package problems;

import utils.Utils;

//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//What is the 10,001st prime number?
public class Problem007 {
    public static void main(String[] args) {
        long primeIndex = 2;
        long num = 3;

        while (true) {
            num += 2;
            if (Utils.isPrime(num)) {
                primeIndex++;
                if (primeIndex == 10001L) {
                    System.out.println(num + " is the 10,001st prime");
                    break;
                }
            }
        }
    }
}
