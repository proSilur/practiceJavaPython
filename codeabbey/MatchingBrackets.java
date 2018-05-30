
import java.util.Scanner;
import java.util.Stack;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < steps; i++) {
            System.out.print(checkParentesis(scanner.nextLine()) + " ");
        }
    }

    private static int checkParentesis(String str) {
        if (str.isEmpty()) return 1;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == '{' || current == '(' || current == '[' || current == '<') {
                stack.push(current);
            }

            if (current == '}' || current == ')' || current == ']' || current == '>') {
                if (stack.isEmpty()) return 0;
                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[' || current == '>' && last == '<')
                    stack.pop();
                else return 0;
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
