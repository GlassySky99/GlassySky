package lr4;

import java.util.Random;
import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        int a = scanner.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        int b = scanner.nextInt();
        int firstArray[][]  = new int[a][b];
        for (int i = 0; i < a; i++) {
            System.out.println();
            for (int j = 0; j < b; j++) {
                firstArray[i][j] = rnd.nextInt(9);
                System.out.print(firstArray[i][j] + " ");
            }
        }
        System.out.println();
        int deleteA = rnd.nextInt(a-1);
        int deleteB = rnd.nextInt(b-1);
        System.out.println("удаляются " + (deleteA+1) + " строка и " + (deleteB+1) + " столбец");
        
        int secondArray[][] = new int[a-1][b-1];
        for (int i = 0, A = 0; i<a-1; A++) {
            if (A!= deleteA){
                System.out.println();
                for (int j = 0,B = 0; j <b-1 ; B++) {
                    if (B!= deleteB){
                        secondArray[i][j] = firstArray[A][B];
                        System.out.print(secondArray[i][j] + " ");
                        j++;
                    }
                }
                i++;
            }
            
        }
    }
}