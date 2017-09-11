package utils;

import org.junit.Assert;
import org.junit.Test;

public class UtilsTest {
    @Test
    public void isPrime() throws Exception {
        Assert.assertFalse(Utils.isPrime(1L));
        Assert.assertTrue(Utils.isPrime(2L));
        Assert.assertTrue(Utils.isPrime(3L));
        Assert.assertTrue(Utils.isPrime(7L));
        Assert.assertFalse(Utils.isPrime(8L));
        Assert.assertFalse(Utils.isPrime(21L));
        Assert.assertFalse(Utils.isPrime(25L));
        Assert.assertTrue(Utils.isPrime(29L));
    }

}