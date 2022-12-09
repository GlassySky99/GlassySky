package lr3;

import java.util.Scanner;

public class example5b {
    public static void main (String[] args)
    {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите количество чисел для сложения");
        int size = id.nextInt();
        int result = 0;
        int value = 0;
        int counter = 0;

        while(size > 0)
        {
            if(value%5 == 2 || value%3 == 1)
            {
                result = result + value;
                System.out.println("Элемент ["+counter+"] = " + value);
                value++;
                counter++;
                size--;
            }
            else
                value++;
        }
        System.out.println("Сумма всех элементов = " + result);
    }
}
