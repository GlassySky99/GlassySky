//9. Напишите программу со статическим методом, аргументом которому передается
//одномерный символьный массив. В результате вызова метода элементы массива попарно
//меняются местами: первый — с последн и м , второй — с предпоследним и так далее.
package lr6.example9;

import java.util.Arrays;

public class MyClass1 {
    public static void reverse(char[] chars){
        System.out.println("original char: " + Arrays.toString(chars));
        if (chars == null || chars.length <=1){
            return;
        }
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];

            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        System.out.println("reversed array : " + Arrays.toString(chars));
    }
}