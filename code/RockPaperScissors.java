import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < steps; i++) {
            int a = 0, b = 0;
            String[] arr = scanner.nextLine().split("\\s");
            for (String x : arr) {
                if (x.equals("RS") || x.equals("SP") || x.equals("PR")) a++;
                if (x.equals("SR") || x.equals("PS") || x.equals("RP")) b++;
            }
            System.out.print((a > b ? 1 : 2) + " ");
        }
    }
}