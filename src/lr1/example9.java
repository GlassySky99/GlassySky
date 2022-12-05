package lr1;
import java.util.Scanner;
public class example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What mounth is it:");
        String a = in.nextLine();

        System.out.println("Input day of this mounth:");
        String c = in.nextLine();

        System.out.println("In " + a + " " + c + " days.");
        in.close();

    }
}
