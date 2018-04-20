import java.util.ArrayList;
import java.util.Scanner;

public class NeumannsRandomGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < steps; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            int x = scanner.nextInt(), counter = 0;
            for (; !list.contains(x); counter++) {
                list.add(x);
                x = (int) (Math.pow(x, 2) / 100) % 10000;
            }
            System.out.print(counter + " ");
        }
    }
}

