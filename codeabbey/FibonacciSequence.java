
import java.math.BigDecimal;
import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < steps; i++) {
            System.out.print(fibonacci(new BigDecimal(scanner.nextLine())) + " ");
        }
    }

    private static int fibonacci(BigDecimal x) {
        if(x.compareTo(BigDecimal.valueOf(0)) <= 0) return 0;
        BigDecimal a;
        BigDecimal b = BigDecimal.valueOf(0);
        BigDecimal y = BigDecimal.valueOf(1);
        int i = 0;
        for (; !x.equals(y); i++) {
            a = b;
            b = y;
            y = a.add(b);
        }
        return i + 1;
    }
}
