package lr4;

import java.util.Scanner;

public class example7 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("введите количество строк массива: ");
        int a = id.nextInt();
        System.out.print("введите количество столбцов массива: ");
        int b = id.nextInt();
        int Array[][] = new int[a][b];
        int z = 0,x = 0, c = 0;
        for (int i = 0; c < Array.length; c++) {
            for (int j = 0; j < (Array[i].length - z); j++) {
                Array[i][j] = x;
                x++;
            }
            if (i < Array.length-1) {
                i++;}
            for(int o=a-1; o>z; o--){
                Array[o][Array[i].length-1-z] = x;
                x++;
            }
            z++;
        }
        for (int i = 0; i < Array.length; i++) {
            System.out.println();
            for (int j = 0; j < Array[i].length; j++) {
                System.out.print(Array[i][j] + " ");
            }
        }
    }
}