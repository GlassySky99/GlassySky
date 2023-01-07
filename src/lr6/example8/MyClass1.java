//8. Напишите программу со статическим методом, аргументом которому передается
//целочисленный массив, а результатом возвращается среднее значение для элементов
//массива (сумма значений элементов, деленная на количество элементов в массиве).
package lr6.example8;

import java.util.Arrays;

public class MyClass1 {
    public static double Avarage(int[] v) {

        return  (double) Arrays.stream(v).sum() / v.length;
    }
}