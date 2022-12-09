package lr3;

import java.util.Scanner;

public class example3b {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите колиичество цифр в масиве");
        int size = id.nextInt();
        int i = 0;
        int[] a = new int[size];
        while (i < size) {
            if (i <= 1)
                a[i] = 1;
            else {
                a[i] = a[i - 2] + a[i - 1];
            }
            System.out.println("Элемент массива [" + i + "] = " + a[i]);
            i++;
        }
    }
}