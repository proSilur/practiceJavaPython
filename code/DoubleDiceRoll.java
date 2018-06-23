import java.util.Scanner;

public class DoubleDiceRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < steps; i++) {
            System.out.print(((scanner.nextInt() % 6) + 1) + ((scanner.nextInt() % 6) + 1) + " ");
        }
    }
}
