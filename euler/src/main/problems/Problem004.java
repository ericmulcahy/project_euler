package problems;

import utils.Utils;

//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.
public class Problem004 {
    public static void main(String[] args) {
        long largest = 0L;
        for (long i=1; i<1000; i++) {
            for (long j=1; j<1000; j++) {
                long val = i * j;
                if (val > largest && Utils.isPalindrome(val)) {
                    largest = val;
                }
            }
        }
        System.out.println(largest);
    }
}
