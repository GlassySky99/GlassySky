//Представим себе бесконечную последовательность цифр, составленную из записанных друг за другом возрастающих степеней десятки. Вот начало этой последовательности: 110100100010000… Всё, что надо — определить, какая цифра находится в такой последовательности на определённом месте.
//Исходные данные
//В первой строке находится целое число N (1 ≤ N ≤ 65535). В i-й из N последующих строк записано целое число Ki — номер позиции в последовательности (1 ≤ Ki ≤ 231 − 1).
//Результат
//Выведите через пробел N цифр. i-я цифра должна равняться цифре, которая находится в описанной выше последовательности на позиции с номером Ki.
package timus;

import java.util.Scanner;
import java.util.StringJoiner;

public class task_1209
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        StringJoiner result = new StringJoiner(" ");
        while (num > 0)
        {
            long x = in.nextLong();
            double s = Math.sqrt(x*8-7);
            if (s % 1 == 0)
                result.add("1");
            else
                result.add("0");
            num--;
        }
        in.close();
        System.out.println(result);
    }
}
