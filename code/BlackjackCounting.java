import java.util.Scanner;

public class BlackjackCounting {
    public static void main(String[] args) {
        String[] cardDeck = {"2", "3", "4", "5", "6", "7", "8", "9"};
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < steps; i++) {
            String temp = scanner.nextLine();
            String[] table = temp.split("\\s");
            int counter = 0;
            int aceCounter = temp.replaceAll("[^A]", "").length();

            for (int k = 0; k < table.length; k++) {
                for (int j = 0; j < cardDeck.length; j++) {
                    if (cardDeck[j].equals(table[k])) {
                        counter += j + 2;
                        break;
                    }
                }
                if (table[k].equals("A")) {
                    counter += 11;
                } else if (table[k].equals("T") || table[k].equals("J") ||
                        table[k].equals("Q") || table[k].equals("K")) {
                    counter += 10;
                }
            }
            while (aceCounter > 0 && counter > 21){
                counter -=10;
                aceCounter--;
            }
            System.out.print((counter < 22) ? counter + " " : "Bust ");
        }
    }
}
