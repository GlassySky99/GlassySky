//Стоит себе ферма. На ферме сидит фермер и считает, сколько кого есть у него на ферме - a верблюдов, b баранов, с зеленых тараканов. Почему-то an + bn = cn. Известно n. Найти все остальное.
//Исходные данные
//n (0 ≤ n ≤ 100)
//Результат
//Три различных целых числа (а, b, c) таких, что аn + bn = cn, 1 ≤ a, b, c ≤ 100. Если решений несколько, вывести то, где a минимально. Если и таких несколько, вывести то, где минимально b и т.д. Вывести −1, если решения нет.
package timus;

import java.util.Scanner;

public class task_1349 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        if(a==1) System.out.println(1 + " " + 2 + " " + 3);
        else if(a==2) System.out.println(3 + " " + 4 + " " + 5);
        else System.out.println(-1);
    }
}
