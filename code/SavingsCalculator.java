import java.util.Scanner;

public class SavingsCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int steps = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < steps; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();
            int counter = 0;
            while (x <= y) {
                x += x * (z / 100);
                counter++;
            }
            System.out.print(counter + " ");
        }
    }
}
