import java.util.Scanner;

public class First {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Let me see is it even:");
            int vvod = in.nextInt();
            if (vvod % 2 == 0) {
                System.out.println("Yep");
            } else {
                System.out.println("Nop");
            }
        } catch (Exception e) {
            System.out.println("That's not a number");
        }
    }
}
