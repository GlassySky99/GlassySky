//5. Напишите программу со статическим методом, которым вычисляется сумма
//квадратов натуральных чисел 12 + 22 + 32 + ... + п
//2. Число п передается аргументом методу.
//Предложите версию метода с рекурсией и без рекурсии. Для проверки результата можно
//использовать формулу 12 + 22 +3
//2+…+n
//2=
//(n+l) (2n + 1)/6
package lr6.example5;

public class MyClass1 {
    public static int sum(int value) {
        if (value == 1) {
            return 1 ;
        }
        int result = value * value + sum(value - 1);
        return result;
    }

    public static int sum2(int value){
        int result = 0;
        for (int i = 1; i <= value ; i++) {
            int kd = i * i;
            result += kd;
        }
        return result;
    }
}
