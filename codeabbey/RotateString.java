import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < steps; i++) {
            int x = scanner.nextInt();
            String s = scanner.nextLine().trim();
            if (x > 0) {
                for (int j = 0; j < x; j++) {
                    s = s.substring(1) + s.charAt(0);
                }
            } else {
                for (int j = 0; j < Math.abs(x); j++) {
                    s = s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
                }
            }
            System.out.print(s + " ");
        }
    }
}
