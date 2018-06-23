
// Problem #21

import java.util.Scanner;

public class ArrayCounters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = scanner.nextInt();
        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < steps; i++) {
            numbers[scanner.nextInt() - 1]++;
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
