package lr3;

import java.util.Scanner;

public class example3a {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите колиичество цифр в масиве");
        int size = id.nextInt();

        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            if (i <= 1)
                a[i] = 1;
            else {
                a[i] = a[i - 2] + a[i - 1];
            }
            System.out.println("Элемент массива [" + i + "] = " + a[i]);
        }
    }
}
