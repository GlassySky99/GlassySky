package lr1;
import java.util.Scanner;
public class example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input surname:");
        String name1 = in.nextLine();

        System.out.println("Input first name:");
        String name2 = in.nextLine();

        System.out.println("Input second name:");
        String name3 = in.nextLine();

        System.out.println("Hello " + name1 + " " + name2  + " " + name3 + "!");
        in.close();

    }
}