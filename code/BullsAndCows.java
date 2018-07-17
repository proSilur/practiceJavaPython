import java.util.Scanner;

public class BullsAndCows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = String.valueOf(scanner.nextInt());
        int steps = scanner.nextInt();
        for (int i = 0; i < steps; i++) {
            int x = 0, y = 0;
            String temp = scanner.next();
            for (int j = 0; j < number.length(); j++) {
                if (number.indexOf(temp.charAt(j)) != -1) {
                    y++;
                    if (number.toCharArray()[j] == temp.toCharArray()[j]) {
                        x++;
                        y--;
                    }
                }
            }
            System.out.print(x + "-" + y + " ");
        }
    }
}