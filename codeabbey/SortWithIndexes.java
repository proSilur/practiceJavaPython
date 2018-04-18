import java.util.Arrays;
import java.util.Scanner;

public class SortWithIndexes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[steps];

        for (int i = 0; i < steps; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        Arrays.sort(arr);


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == arr[i]) {
                    System.out.print(1 + j + " ");
                    break;
                }
            }
        }
    }
}


