import java.util.Scanner;

public class CardNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] cards = scanner.nextLine().split("\\s");
        for (String card : cards) {
            System.out.print(ranks[Integer.parseInt(card) % 13] + "-of-" + suits[Integer.parseInt(card) / 13] + " ");
        }
    }
}
