import java.util.Scanner;

public class IntegerFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < steps; i++) {
            System.out.print(primes(scanner.nextLong()) + " ");
        }
    }


    private static String primes(long value) {
        StringBuilder tmp = new StringBuilder();
        int del = 2;

        for (int i = 0; i < 20000; i++) {
            if (value % del == 0) {
                value /= del;
                tmp.append(del).append("*");
            } else del++;
        }
        tmp.deleteCharAt(tmp.length() - 1);
        return tmp.toString();
    }
}
