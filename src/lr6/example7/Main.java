//7. Напишите программу со статическим методом, аргументом которому передастся
//символьный массив, а результатом возвращается ссылка на целочисленным массив,
//состоящий из кодов символов из массива - аргумента.
package lr6.example7;

public class Main {
    public static void main(String[] args) {
        MyClass1 myClass1 = new MyClass1();
        char[] set = new char[]{'П','р','и','в','е','т'};
        int[] set1 = MyClass1.Set(set);
        for (int i = 0; i < set1.length; i++) {
            System.out.print(set1[i] + " ");
        }
    }
}
