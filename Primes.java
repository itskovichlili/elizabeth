<<<<<<< HEAD
package prime;

public class Primes {
    public static boolean isPrime(int n) {
		// check if n is a prime number;
		// check only odd numbers for good performance
		// go to sqrt(n)
        boolean ans = true;
        if (n==2) return true;
        if (n%2==0)  return false;
        if (n<=7) return true;
        for (int i=3; ans && i<=Math.sqrt(n); i=i+2) {
            if (n % i == 0) ans = false;
        }
        return ans;
    }
}
"" 
"more text" 
=======
package prime;

public class Primes {
    public static boolean isPrime(int n) {
        boolean ans = true;
		if (n==2 || n== 3) ans = true;
        for (int i = 2; ans && i <= Math.sqrt(n); i++) {
            if (n % i == 0) ans = false;
        }
        return ans;
    }
}
>>>>>>> 2410562 (Initial commit)
