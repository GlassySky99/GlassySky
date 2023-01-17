//Всё, что от вас требуется — найти сумму всех целых чисел, лежащих между 1 и N включительно.
//Исходные данные
//В единственной строке расположено число N, по модулю не превосходящее 10000.
//Результат
//Выведите целое число — ответ задачи.
package timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_1068 {
    public static void main(String[] args) throws NumberFormatException,IOException
    {

        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

        short N = Short.parseShort (reader.readLine());
        int result = 0;

        if (N < 1)
        {
            for (short i = N; i <= 1; i++)
            {
                result=(N+1)*(2-N)/2;
            }
        }
        else
        {
            result = (1 + N) * N / 2;
        }
        System.out.println(result);
    }
}
