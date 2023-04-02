package lr12;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, m, size;
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        System.out.println("Введите размерность первого массива:");
        System.out.printf("n = ");
        n = in.nextInt();
        int[] a = new int[n];
        System.out.println("Введите элементы первого массива:");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
            s1.add(a[i]);
        }
        System.out.println("Введите размерность второго массива:");
        System.out.printf("m = ");
        m = in.nextInt();
        int[] b = new int[m];
        System.out.println("Введите элементы второго массива:");
        for (int i = 0; i < b.length; i++) {
            b[i] = in.nextInt();
            s2.add(b[i]);
        }
        s1.retainAll(s2);
        size = s1.size();
        Integer[] c = new Integer[size];
        s1.toArray(c);
        System.out.println("Общие элементы для обоих массивов:");
        for (int i = 0; i < c.length; i++) {
            System.out.printf("%d ", c[i]);
        }
    }
}
