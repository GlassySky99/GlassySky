//2. Напишите программу с классом, в котором есть закрытое статическое
//целочисленное ноле с начальным нулевым значением. В классе должен быть описан
//статический метод, при вызове которого отображается текущее значение статического
//поля, после чего значение поля увеличивается на единицу.
package lr6.example2;

public class MyClass1 {
    private static int a;
    public static void num1(){
        System.out.println(a);
        a++;
    }
}