package lr3;

import java.util.Scanner;

public class example5a {
    public static void main (String[] args)
    {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите количество чисел для сложения");
        int size = id.nextInt();
        int result = 0;
        int valuem = 0;

        for(int i = 0; size > 0;)
        {
            if(valuem%5 == 2 || valuem%3 == 1)
            {
                result = result + valuem;
                System.out.println("Элемент массива ["+i+"] = " + valuem);
                valuem++;
                i++;
                size--;
            }
            else
                valuem++;
        }
        System.out.println("Сумма всех элементов = " + result);
    }
}
