package lr3;
import java.util.Scanner;
public class example1 {
    public static void main (String[] args){
        Scanner id = new Scanner(System.in);
        System.out.println("Введите номер дня недели");
        int numsDay = id.nextInt();
        String nameDay;
        switch (numsDay){
            case 1:
                nameDay = "Понедельник";
                break;
            case 2:
                nameDay = "Вторник";
                break;
            case 3:
                nameDay = "Среда";
                break;
            case 4:
                nameDay = "Четверг";
                break;
            case 5:
                nameDay = "Пятница";
                break;
            case 6:
                nameDay = "Суббота";
                break;
            case 7:
                nameDay = "Воскресение";
                break;
            default:
                nameDay = "Ошибка";
                break;
        }
        System.out.println(nameDay);
    }
}
