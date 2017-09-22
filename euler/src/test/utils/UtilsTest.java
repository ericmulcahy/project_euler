package utils;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UtilsTest {
    @Test
    public void isPrime() throws Exception {
        assertFalse(Utils.isPrime(1L));
        assertTrue(Utils.isPrime(2L));
        assertTrue(Utils.isPrime(3L));
        assertTrue(Utils.isPrime(7L));
        assertFalse(Utils.isPrime(8L));
        assertFalse(Utils.isPrime(21L));
        assertFalse(Utils.isPrime(25L));
        assertTrue(Utils.isPrime(29L));
    }

    @Test
    public void testIsPalindrome() throws Exception {
        assertTrue(Utils.isPalindrome(123321L));
        assertTrue(Utils.isPalindrome(121L));
        assertTrue(Utils.isPalindrome(1221L));
        assertFalse(Utils.isPalindrome(1234L));
        assertFalse(Utils.isPalindrome(1231L));
    }
}