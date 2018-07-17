import java.math.BigInteger;
import java.util.Scanner;

public class CombinationsCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < steps; i++) {
            int N = scanner.nextInt(), K = scanner.nextInt();
            System.out.print(factorialBI(N).divide(factorialBI(K).multiply(factorialBI(N - K))) + " ");
        }
    }

    private static BigInteger factorialBI(int n) {
        BigInteger ret = BigInteger.ONE;  // ret = 1
        for (int i = 1; i <= n; ++i) {
            ret = ret.multiply(BigInteger.valueOf(i));
        }
        return ret;
    }
}
