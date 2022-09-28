import java.util.Scanner;

public class Second {
    public static void main(String args []) {
        Scanner vv = new Scanner(System.in);
        System.out.println("Your numbers: ");
        int a = vv.nextInt();
        int b = vv.nextInt();
        int c = vv.nextInt();
        int temp;
        if (a > b) {
            temp = a; 
            a = b; 
            b = temp;
        }
        if (b > c) {
            temp = b; 
            b = c; 
            c = temp;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println(a  + " " + b + " " + c);
    }
}
