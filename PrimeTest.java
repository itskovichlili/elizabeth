package prime;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeTest {
    @Test
    public void test1() {assertTrue(Primes.isPrime(13));}
    @Test
    public void test2() {
        assertTrue(Primes.isPrime(2));
    }
    @Test
    public void test3() {
        assertTrue(Primes.isPrime(3));
    }
    @Test
    public void test4() {
        assertFalse(Primes.isPrime(4));
    }
    @Test
    public void test5() {assertTrue(Primes.isPrime(5));}
    @Test
    public  void test6() {assertFalse(Primes.isPrime(6));}
    @Test
    public  void test7() {assertTrue(Primes.isPrime(7));}
    @Test
    public  void test8() {assertFalse(Primes.isPrime(8));}
    @Test
    public  void test9() {assertFalse(Primes.isPrime(9));}
    @Test
    public  void test10() {assertFalse(Primes.isPrime(10));}
    @Test
    public  void test10() {assertTrue(Primes.isPrime(1000003));}
}
