import java.util.Scanner;

public class BitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < steps; i++) {
            System.out.print(Integer.bitCount(scanner.nextInt()) + " ");
        }
    }
}
