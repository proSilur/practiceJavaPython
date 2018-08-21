import java.util.Scanner;

public class ParityControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split("\\s");
        for (String value : s) {
            printBinary(Long.parseLong(value));
        }
    }

    private static void printBinary(long value) {
        if (Long.bitCount(value) % 2 != 0) return;
        StringBuilder res = new StringBuilder();
        for (int i = 6; i >= 0; i--) {
            long mask = 1L << i;
            long result = (mask & value) >> i;
            res.append(result);
        }
        System.out.print((char) Integer.parseInt(String.valueOf(res), 2));
    }
}
