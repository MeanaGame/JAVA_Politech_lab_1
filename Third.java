import java.util.Scanner;

public class Third {
    public static void main(String args[]) {
        double D;
        Scanner w = new Scanner(System.in);
        System.out.println("Print a: ");
        int a = w.nextInt();
        System.out.println("Print b: ");
        int b = w.nextInt();
        System.out.println("Print c: ");
        int c = w.nextInt();
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println(" x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Only one x = " + x);
        }
        else {
            System.out.println("Does not have it");
        }
    }
}
