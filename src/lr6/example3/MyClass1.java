//3. Напишите программу с классом, в котором есть статические методы, которым
//можно передавать произвольное количество целочисленных аргументов (или
//целочисленный массив). Методы, на основании переданных аргументов или массива,
//позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
//значение из набора чисел.
package lr6.example3;
import java.util.Arrays;
public class MyClass1 {
    public static void Min(int... v) {
        int min;

        if (v.length != 0) {
            min = v[0];
            for (int i = 0; i < v.length; i++) {
                if (v[i] < min) {
                    min = v[i];
                }
            }
            System.out.println("min = " + min);
        } else
            System.out.println("Нет значений");
    }

    public static void Max(int... v) {
        int max;

        if (v.length != 0) {
            max = v[0];
            for (int i = 0; i < v.length; i++) {
                if (v[i] > max) {
                    max = v[i];
                }
            }
            System.out.println("max = " + max);
        } else
            System.out.println("Нет значений");
    }

    public static void Avarage(int... v) {

        double avarage = (double) Arrays.stream(v).sum() / v.length;
        System.out.println("avarage = " + avarage);
    }
}