package problems;

import utils.Utils;

//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?
public class Problem003 {
    public static void main(String[] args) {
        long magicNumber = 600851475143L;
        long start = 3;
        long end = new Double(Math.sqrt(magicNumber)).longValue();
        long answer = 0L;
        for (long i = start; i<=end; i+=2) {
            if (magicNumber % i == 0 && Utils.isPrime(i)) {
                answer = i;
            }
        }
        System.out.println(answer);
    }
}
