import java.math.BigDecimal;
import java.util.Scanner;

public class FibonacciDivisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        String[] arr = new String[steps];
        for (int i = 0; i < steps; i++) {
            int x = scanner.nextInt();
            for (int j = 0; j < 10000; j++) {
                if (check(fibonacci(j), BigDecimal.valueOf(x))) {
                    arr[i] = String.valueOf(++j);
                    break;
                }
            }
        }

        for (String s : arr) {
            System.out.print(s + " ");
        }
    }

    private static boolean check(BigDecimal decimal1, BigDecimal decimal2) {
        BigDecimal[] s = decimal1.divideAndRemainder((decimal2));
        return s[1].equals(BigDecimal.ZERO);
    }

    private static BigDecimal fibonacci(int x) {
        BigDecimal a1;
        BigDecimal b1 = BigDecimal.ZERO;
        BigDecimal y1 = BigDecimal.ONE;

        for (int i = 0; i < x; i++) {
            a1 = b1;
            b1 = y1;
            y1 = a1.add(b1);
        }
        return y1;
    }
}
