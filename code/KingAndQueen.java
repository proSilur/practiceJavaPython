
import java.util.Arrays;
import java.util.Scanner;

public class KingAndQueen {
    private static final String ranks[] = {"1", "2", "3", "4", "5", "6", "7", "8"};
    private static final String files[] = {"a", "b", "c", "d", "e", "f", "g", "h"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < steps; i++) {
            String[] cards = scanner.nextLine().split("\\s");
            System.out.print(checkDiagonal(cards[0], cards[1]) ? "Y " : "N ");
        }
    }

    private static boolean checkDiagonal(String king, String queen) {
        if (king.charAt(1) == queen.charAt(1) || king.charAt(0) == queen.charAt(0)) return true;
        String temp = "";
        int ranksIndex = Arrays.asList(ranks).indexOf(String.valueOf(queen.charAt(1)));
        int filesIndex = Arrays.asList(files).indexOf(String.valueOf(queen.charAt(0)));

        for (int j = filesIndex, i = ranksIndex; j < files.length && i < ranks.length; j++, i++) {
            temp = files[j] + ranks[i];
            if (king.equals(temp)) return true;
        }
        for (int j = filesIndex, i = ranksIndex; (j < files.length && j >= 0) && i < ranks.length; j--, i++) {
            temp = files[j] + ranks[i];
            if (king.equals(temp)) return true;
        }
        for (int j = filesIndex, i = ranksIndex; (j < files.length && j >= 0) && (i < ranks.length && i >= 0); j--, i--) {
            temp = files[j] + ranks[i];
            if (king.equals(temp)) return true;
        }
        for (int j = filesIndex, i = ranksIndex; j < files.length && (i < ranks.length && i >= 0); j++, i--) {
            temp = files[j] + ranks[i];
            if (king.equals(temp)) return true;
        }
        return false;
    }
}

// Нормальное решение задачи:
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int num = Integer.parseInt(in.nextLine());
//        while (num-- > 0) {
//            String K = in.next();
//            String Q = in.next();
//
//            int xK = K.charAt(0);
//            int yK = K.charAt(1);
//
//           int xQ = Q.charAt(0);
//            int yQ = Q.charAt(1);
//
//           if (xK == xQ || yK == yQ || Math.abs(xK - xQ) == Math.abs(yK - yQ)) {
//                System.out.print("Y ");
//            } else {
//                System.out.print("N ");
//            }
//        }
//    }