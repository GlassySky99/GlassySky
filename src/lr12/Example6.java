package lr12;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строки через пробел: ");
        String[] input = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<Integer>();
        for (String str : input) {
            numbers.add(Integer.parseInt(str));
        }

        System.out.print("Введите делитель: ");
        int divisor = scanner.nextInt();

        List<Integer> divisibleNumbers = getDivisibleNumbers(numbers, divisor);

        System.out.println("Числа, поделённые на " + divisor + ":");
        for (int num : divisibleNumbers) {
            System.out.println(num);
        }
    }
    public static List<Integer> getDivisibleNumbers(List<Integer> numbers, int divisor) {
        List<Integer> result = new ArrayList<Integer>();
        for (int num : numbers) {
            if (num % divisor == 0) {
                result.add(num);
            }
        }
        return result;
    }
}
