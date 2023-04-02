package lr12;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строки через пробел: ");
        String[] input = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<Integer>();
        for (String str : input) {
            numbers.add(Integer.parseInt(str));
        }

        List<Integer> squaredNumbers = squareNumbers(numbers);

        System.out.println("Квадрат чисел:");
        for (int num : squaredNumbers) {
            System.out.println(num);
        }
    }
    public static List<Integer> squareNumbers(List<Integer> numbers) {
        List<Integer> result = new ArrayList<Integer>();
        for (int num : numbers) {
            result.add(num * num);
        }
        return result;
    }
}
