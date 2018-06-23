import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < steps; i++) {
            String s = scanner.nextLine().replaceAll("[^A-Za-z0-9]", "").toLowerCase();
            System.out.print((s.equals(new StringBuffer(s).reverse().toString())) ? "Y " : "N ");
        }
    }
}
