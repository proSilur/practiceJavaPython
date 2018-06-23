
import java.util.Scanner;

public class LinearFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = scanner.nextInt();
        for (int i = 0; i < steps; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            int k = (y2 - y1) / (x2 - x1);
            int b = (x2 * y1 - x1 * y2) / (x2 - x1);
            System.out.println("(" + k + " " + b + ") ");
        }
    }
}
