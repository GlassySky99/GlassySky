package lr13;

import java.util.Arrays;
import java.util.Random;
public class Example5 {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        int[] arr = new int[20];
        for (int i =0;i<arr.length;i++)
        {
            arr[i] = rand.nextInt(100);
            System.out.println("["+i+"] элемент массива: "+arr[i]);
        }
        //число ядер процессоров
        int threadsCount = Runtime.getRuntime().availableProcessors();
        // длина подмассива, обрабатываемый каждым потоком
        int partLength = arr.length/threadsCount;
        //массив для хранениия найденных максимальных значений в каждом подмассиве
        int[] maxValues = new int[threadsCount];

        Thread[] threads = new Thread[threadsCount];
        for (int i = 0;i <threadsCount;i++)
        {
            int startIndex =i*partLength;
            //Сначала вычисляется
            //выражение_1. Если оно дает логическое значение true , то вычисляется
            //выражение_2, а его значение становится результирующим для всего оператора
            //?. Если же выражение_1 дает логическое значение false , то вычисляется
            //выражение_3, а его значение становится результирующим для всего оператора ?.
            //(c) Г. Шилдт
            int endIndex = (i== threadsCount-1)?arr.length:(i+1)*partLength;

            int[] subArr = Arrays.copyOfRange(arr,startIndex,endIndex);

            int finalI = i;
            Thread thread = new Thread(()->
                    maxValues[finalI] = findMaxValue(subArr));
            thread.start();
            threads[i] = thread;

        }
        for (Thread thread:threads)
        {
            thread.join();
        }
        int maxValue = maxValues[0];
        for (int i = 0;i <threadsCount;i++)
        {
            if (maxValues[i] > maxValue)
            {
                maxValue = maxValues[i];
            }
        }
        System.out.println("Максимальное значение: "+maxValue);
    }
    static int findMaxValue(int[] arr)
    {
        int maxValue = arr[0];
        for (int i = 1;i< arr.length;i++)
        {
            if (arr[i] >maxValue)
            {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
