package lr4;

import java.util.Random;

public class example5 {
    public static void main(String[] args) {
        int[][] a = new int[3][5];
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rnd.nextInt(9) + 1;
            }
        }
        for (int i = 0; i < a.length; i++, System.out.println()) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println();
        int[][] b = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++) {
                b[j][i] = a[i][j];
            }
        for (int i = 0; i < b.length; i++, System.out.println()) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
        }
    }
}