// мой пиздюк
private static String sx = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = scanner.nextInt();
        int shift = scanner.nextInt();

        for (int i = 0; i < steps + 1; i++) {
            System.out.print(result(scanner.nextLine(), shift) + " ");
        }
    }

    private static char circleArray(int index, int shift) {
        char x = '1';
        for (int i = index; shift > 0; shift--, i--) {
            if (i == 0) {
                x = sx.toCharArray()[i];
                i = 26;
            } else x = sx.toCharArray()[i];
        }
        return x;
    }

    private static String result(String s, int shift) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append(' ');
            } else if (s.charAt(i) == '.') {
                sb.append('.');
            } else sb.append(circleArray(sx.indexOf(s.charAt(i)), shift + 1));
        }
        return String.valueOf(sb);
    }