//Вычислите a+b
//Исходные данные
//a и b
//Результат
//a+b
package timus;

import java.util.Scanner;

public class task_1000 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a = scan.nextInt() ,b = scan.nextInt();
        scan.close();
        System.out.println(a+b);
    }
}
