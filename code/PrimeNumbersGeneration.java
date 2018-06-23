package codeabbey;

import java.util.Arrays;
import java.util.Scanner;

// Problem #61
// TODO: 16.04.2018 исправить говнокод 

public class PrimeNumbersGeneration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = scanner.nextInt();
        boolean[] primes = new boolean[2750160];
        int[] nums = new int[200000];
        fillSieve(primes);
        for (int i = 0, h = 0; i < primes.length; i++) {
            if (primes[i]) {
                nums[h] = i;
                h++;
            }
        }
        for (int i = 0; i < steps; i++) {
            System.out.print(nums[scanner.nextInt() - 1] + " ");
        }
    }


    private static void fillSieve(boolean[] primes) {
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;
        for (int i = 2; i < primes.length; ++i) {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; ++j) {
                    primes[i * j] = false;
                }
            }
        }
    }
}

