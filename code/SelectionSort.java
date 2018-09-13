import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < steps; i++) {
            list.add(scanner.nextInt());
        }

        for (int i = 0; i < steps - 1; i++) {
            int index = list.indexOf(Collections.max(list));
            System.out.print(index + " ");
            list.remove(index);
            list.add(index, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }
    }
}