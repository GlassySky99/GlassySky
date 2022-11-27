package lr1;

import java.util.Scanner;

public class example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input year of birth: ");
        int age = in.nextInt();

        int b = 2022 - age;

        System.out.println("Your age: " + b);
        in.close();

    }
}
