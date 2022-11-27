package lr1;

import java.util.Scanner;

public class example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your age: ");
        int age = in.nextInt();

        int b = 2022 - age;

        System.out.println("Your year of birth: " + b);
        in.close();

    }
}