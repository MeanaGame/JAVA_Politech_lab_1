//на вход скан три целых числа и вывводит самое большое из них
import java.util.Scanner;

public class JavaApplication1 {
    static String f1(int x) {
        if (x >= 100 && x < 1000){
            String tap = ((x%10) + " " + ((x/10)%10) + " " + ((x/100)%10));
            return tap;
        }
        else{
            String tap = "ERROR";
            return tap;
        }
    }
    public static void main(String args[]) {
        Scanner w = new Scanner(System.in);
        int num = w.nextInt();
        
        System.out.println(f1(num));
    } 
}