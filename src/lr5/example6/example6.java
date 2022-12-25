//6. Напишите программу с классом, в котором есть два закрытых
//целочисленных поля (назовем их max и min). Значение поля max не может
//быть меньше значения поля min. Значения полям присваиваются с помощью
//открытого метода. Метод может вызываться с одним или двумя
//целочисленными аргументами. При вызове метода значения полям
//присваиваются так: сравниваются текущие значения полей и значения
//аргументов, переданных методу. Самое большое из значений присваивается
//полю max, а самое маленькое из значений присваивается полю min.
//Предусмотрите конструктор, который работает по тому же принципу, что и
//метод для присваивания значений полям. В классе также должен быть метод,
//отображающий в консольном окне значения полей объекта.
package lr5.example6;

public class example6 {
    public static void main(String[] args) {

        Task task = new Task(2, 5);
        task.PrintInt();

        Task task1 = new Task(1);
        task.PrintInt();

        task.SetInt(3, 15);
        task.PrintInt();

        task.SetInt(-9);
        task.PrintInt();
    }

    static class Task {
        private static int min;
        private static int max;



        static void SetInt(int num1, int num2) {
            System.out.println("Метод SetInt() c 2-я аргументами");
            min = Math.min(Math.min(num1, min),num2);
            max = Math.max(Math.max(num1, max),num2);
        }

        static void SetInt(int num) {
            System.out.println("Метод SetInt() c 1-м аргументом");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        static void PrintInt() {
            System.out.println("min = " + min);
            System.out.println("max = " + max);
        }

        Task(int num1, int num2) {
            System.out.println("Конструктор Example_6() c 2-я аргументами");
            min = Math.min(num1,num2);
            max = Math.max(num1,num2);
        }

        Task(int num) {
            System.out.println("Конструктор Example_6() c 1-м аргументом");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
    }
}
