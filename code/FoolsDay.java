import java.util.Scanner;

public class FoolsDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < steps; i++) {
            String[] arr = scanner.nextLine().split("\\s");
            int res = 0;
            for (String anArr : arr) {
                res += Math.pow(Integer.parseInt(anArr), 2);
            }
            System.out.print(res + " ");
        }
    }
}
