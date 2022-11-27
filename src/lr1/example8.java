import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What day of the week:");
        String b = in.nextLine();

        System.out.println("What mounth is it:");
        String a = in.nextLine();

        System.out.println("What day of the month:");
        String c = in.nextLine();

        System.out.println(b + " " + c + " " + a);
        in.close();

    }
}