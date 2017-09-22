package problems;

//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
public class Problem005 {
    public static void main(String[] args) {
        long num = 20;
        long increment = 20;

        // no need to check divisors that are factors of any of these (no need to check 9, if we know 18 is valid)
        Long[] divisorsToCheck = {19L, 18L, 17L, 16L, 15L, 14L, 13L, 12L, 11L};

        while (true) {
            num += increment;
            boolean dividesEvenly = true;
            for (Long divisor : divisorsToCheck) {
                if (num % divisor != 0) {
                    dividesEvenly = false;
                    break;
                }
            }
            if (dividesEvenly) {
                System.out.print(num);
                break;
            }
        }
    }
}
