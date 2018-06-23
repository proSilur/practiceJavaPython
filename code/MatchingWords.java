import java.util.*;

public class MatchingWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split("\\s");
        Map<String, Integer> map = new HashMap<>();
        for (String str : arr) {
            if (!map.containsKey(str)) map.put(str, 1);
            else map.put(str, map.get(str) + 1);
        }
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) list.add(entry.getKey());
        }
        Collections.sort(list);
        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}
