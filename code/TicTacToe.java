import java.util.*;

public class TicTacToe {
    private static final List<List<Integer>> win = Arrays.asList(Arrays.asList(1, 2, 3)
            , Arrays.asList(4, 5, 6)
            , Arrays.asList(7, 8, 9)
            , Arrays.asList(1, 4, 7)
            , Arrays.asList(2, 5, 8)
            , Arrays.asList(3, 6, 9)
            , Arrays.asList(1, 5, 9)
            , Arrays.asList(3, 5, 7));
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < steps; i++) {
            List<Integer> x = new ArrayList<>();
            List<Integer> o = new ArrayList<>();
            String[] game = scanner.nextLine().split("\\s");
            for (int j = 0; j < game.length; j++) {
                if (j % 2 == 0) x.add(Integer.parseInt(game[j]));
                if (j % 2 != 0) o.add(Integer.parseInt(game[j]));
                if (check(x) || check(o)) {
                    System.out.print(++j + " ");
                    break;
                } else if (!check(x) && !check(o) && j == game.length - 1) System.out.println(0 + " ");
            }
        }
    }

    private static boolean check(List<Integer> list) {
        for (List<Integer> aWin : win) {
            if (list.containsAll(aWin)) return true;
        }
        return false;
    }
}