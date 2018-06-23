
// Гипотеза Коллатца (Последовательность Коллатца)

// Problem #48

import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = scanner.nextInt();
        for (int i = 0; i < steps; i++) {
            int counter = 0;
            int step = scanner.nextInt();
            while (step != 1) {
                if (step % 2 == 0) step /= 2;
                else step = 3 * step + 1;
                counter++;
            }
            System.out.print(counter + " ");
        }
    }
}
