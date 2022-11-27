package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_1293 {

    public static void main(String[] args) {

        // +++ Обвязка необходимая для получения данных
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // --- Обвязка необходимамя для получения данных

        // +++ Код решения задачи

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int abc = a * b * c * 2;

        // --- Код решения задачи

        // +++ Обвязка необходимая для вывода данных
        out.println(abc);
        out.flush();
        // --- Обаязка необходимая для вывода данных
    }
}
