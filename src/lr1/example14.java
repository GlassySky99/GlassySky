package lr1;
import java.util.Scanner;
public class example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(": ");
        int a = in.nextInt();

        int b = a - 1;

        int c = a + 1;

        int d = (a + b + c) * (a + b + c);

        System.out.println(a + " " + b + " " + c + " " + d);
        in.close();

    }
}
