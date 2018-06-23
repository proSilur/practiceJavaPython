package codeabbey;

import java.math.BigDecimal;
import java.util.Scanner;

public class ModularCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal decimal = new BigDecimal(scanner.nextLine());

        while (scanner.hasNext()) {
            String[] arr = scanner.nextLine().split("\\s+");
            switch (arr[0]) {
                case "+":
                    decimal = decimal.add(new BigDecimal(arr[1]));
                    break;
                case "*":
                    decimal = decimal.multiply(new BigDecimal(arr[1]));
                    break;
                case "%":
                    decimal = decimal.remainder(new BigDecimal(arr[1]));
                    break;
            }
        }
        System.out.println(decimal);
    }
}
