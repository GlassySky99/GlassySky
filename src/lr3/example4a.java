package lr3;

import java.util.Scanner;

public class example4a {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите два целых числа");
        int a = id.nextInt();
        int b = id.nextInt();
        while (a < b) {
            System.out.println(a);
            System.out.println(b);
            break;
        }
        while (b < a) {
            System.out.println(b);
            System.out.println(a);
            break;
        }
    }
}
