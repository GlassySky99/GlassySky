package lr12;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строки через пробел: ");
        String[] input = scanner.nextLine().split(" ");

        List<String> strings = new ArrayList<String>();
        for (String str : input) {
            strings.add(str);
        }

        System.out.print("Введите подстроку: ");
        String substring = scanner.nextLine();

        List<String> filteredStrings = filterBySubstring(strings, substring);

        System.out.println("Отфильтрованные строки:");
        for (String str : filteredStrings) {
            System.out.println(str);
        }
    }

    public static List<String> filterBySubstring(List<String> strings, String substring) {
        List<String> result = new ArrayList<String>();
        for (String str : strings) {
            if (str.contains(substring)) {
                result.add(str);
            }
        }
        return result;
    }
}
