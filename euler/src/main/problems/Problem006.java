package problems;

//The sum of the squares of the first ten natural numbers is, 1^2 + 2^2 + ... + 10^2 = 385
//The square of the sum of the first ten natural numbers is, (1 + 2 + ... + 10)^2 = 55^2 = 3025
//Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

import java.util.stream.LongStream;

public class Problem006 {
    public static void main(String[] args) {
        Long sumOfSquares = LongStream.rangeClosed(1L, 100L)
                .map(i -> i * i)
                .sum();
        Long sumOfFirstHundredNums = LongStream.rangeClosed(1L, 100L).sum();
        Long squareOfSums = sumOfFirstHundredNums * sumOfFirstHundredNums;
        System.out.println(squareOfSums - sumOfSquares);
    }
}
