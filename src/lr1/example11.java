package lr1;
import java.util.Scanner;
public class example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What your name: ");
        String name = in.nextLine();

        System.out.println("Input year of birth: ");
        int age = in.nextInt();

        int b = 2022 - age;

        System.out.println("Name: " + name);
        System.out.println("Age: " + b);
        in.close();

    }
}
