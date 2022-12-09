package lr3;

import java.util.Scanner;

public class example2a {
    public static void main (String[] args){
        Scanner id = new Scanner(System.in);
        System.out.println("Введите название дня недели с заглавной буквы");
        String nameDay = id.nextLine();
        int numsDay;
        switch (nameDay){
            case "Понедельник":
                numsDay =1;
                break;
            case "Вторник":
                numsDay =2;
                break;
            case "Среда":
                numsDay =3;
                break;
            case "Четверг":
                numsDay =4;
                break;
            case "Пятница":
                numsDay =5;
                break;
            case "Суббота":
                numsDay =6;
                break;
            case "Воскресение":
                numsDay =7;
                break;
            default:
                numsDay = 0;
                break;
        }
        if (numsDay == 0) {
            System.out.print("Ошибка");
        }
        else {
            System.out.println(numsDay);
        }
    }
}
