import java.util.Scanner;
//Stupid ; in the end of solution

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int steps = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < steps; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int x1 = 0, x2 = 0;
            double disc = Math.pow(b, 2) - (4 * a * c);
            if (disc < 0) {
                System.out.printf("%d+%di %d-%di; ", -b / (2 * a), (int) Math.sqrt(-disc) / (2 * a), -b / (2 * a), (int) Math.sqrt(-disc) / (2 * a));
                continue;
            } else if (disc == 0) {
                x1 = x2 = (-b - (int) Math.sqrt(disc)) / (2 * a);
            } else {
                x1 = (-b + (int) Math.sqrt(disc)) / (2 * a);
                x2 = (-b - (int) Math.sqrt(disc)) / (2 * a);
            }
            System.out.print((i != steps - 1) ? x1 + " " + x2 + "; " : x1 + " " + x2);
        }
    }
}
