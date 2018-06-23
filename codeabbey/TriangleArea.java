import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int steps = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < steps; i++) {
            double x1 = sc.nextDouble(), y1 = sc.nextDouble(), x2 = sc.nextDouble(),
                    y2 = sc.nextDouble(), x3 = sc.nextDouble(), y3 = sc.nextDouble();
            double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
            double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
            double c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
            double semiPerimeter = (a + b + c) / 2.0;
            System.out.print((float) Math.abs(Math.sqrt(semiPerimeter * (semiPerimeter - a) *
                    (semiPerimeter - b) * (semiPerimeter - c))) + " ");
        }
    }

    // Other solution
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        System.out.println();
//        for (int i = 0; i < n+1; i++) {
//            System.out.print(triangleArea(scn.nextInt(),scn.nextInt(),scn.nextInt(),scn.nextInt(),scn.nextInt(),scn.nextInt())+" ");
//        }
//    }

//    public static float triangleArea(int x1, int y1, int x2, int y2, int x3, int y3){
//        return (float)Math.abs( (x1-x3)*(y2-y3) - (x2-x3)*(y1-y3) )/2;
//    }
}
