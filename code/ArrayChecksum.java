
import java.util.Scanner;

// Problem #17

public class ArrayChecksum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        long result = 0;

        for (int i = 0; i < steps; i++) {
            result = ((result + scanner.nextLong()) * 113) % 10000007;
        }
        System.out.println(result);
    }
}
