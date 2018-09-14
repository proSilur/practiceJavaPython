import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        int[] array = new int[steps];
        for (int i = 0; i < steps; i++) {
            array[i] = scanner.nextInt();
        }
        sort(array);
    }

    private static void sort(int[] arr) {
        int counter = 0;
        int temp, j;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                counter++;
                while (j > 0 && temp < arr[j - 1]) {
                    counter++;
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
            System.out.print(counter + " ");
            counter = 0;
        }
    }
}