//C(N, K)
//C(4, 2)

// Вариации из 2 разных конфет при общем колличестве 4

//A B C D - four sorts of candies
//A+B, A+C, A+D, B+C, B+D, C+D - six way to choose a pair of them.


//       N!
// ------------- = C(N, K) - the number of different combinations
// K! * (N - K)!


//input data:
//3
//3 0
//4 2
//5 2

//answer:
//1 6 10



import java.math.BigInteger;
import java.util.Scanner;

public class CombinationsCounting {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int steps = Integer.parseInt(scanner.nextLine());
//        for (int i = 0; i < steps; i++) {
//            int N = scanner.nextInt(), K = scanner.nextInt();
//            System.out.print(factorialBI(N).divide(factorialBI(K).multiply(factorialBI(N - K))) + " ");
//        }
//    }
//
//    private static BigInteger factorialBI(int n) {
//        BigInteger ret = BigInteger.ONE;  // ret = 1
//        for (int i = 1; i <= n; ++i) {
//            ret = ret.multiply(BigInteger.valueOf(i));
//        }
//        return ret;
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int steps = in.nextInt();
        for (int i = 0; i < steps; i++) {
            int n = in.nextInt(), k = in.nextInt();
            System.out.print(Math.round(f(n) / f(k) / f(n - k)) + " ");
        }
    }

    private static double f(int n) {
        double num = 1;
        for (int i = 1; i <= n; i++)
            num *= i;
        return num;
    }
}
