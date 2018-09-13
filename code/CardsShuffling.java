import java.util.Scanner;

public class CardsShuffling {
    private static final String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
    private static final String[] suits = {"C", "D", "H", "S"};


    public static void main(String[] args) {
        String[] cardDeck = createCardDeck();
        Scanner scanner = new Scanner(System.in);
        String[] arrValues = scanner.nextLine().split("\\s");
        for (int i = 0; i < cardDeck.length; i++) {
            int index = Integer.parseInt(arrValues[i]) % 52;
            String temp = cardDeck[i];
            cardDeck[i] = cardDeck[index];
            cardDeck[index] = temp;
        }

        for (String aCardDeck : cardDeck) {
            System.out.print(aCardDeck + " ");
        }
    }

    static String[] createCardDeck() {
        String[] cardDeck = new String[52];
        int counter = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                cardDeck[counter++] = suit + rank;
            }
        }
        return cardDeck;
    }
}
