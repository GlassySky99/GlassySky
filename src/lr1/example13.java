package lr1;

import java.util.Scanner;

public class example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int a = in.nextInt();

        System.out.println("Input second number: ");
        int b = in.nextInt();

        int c = a + b;

        System.out.println(c);
        in.close();

    }
}