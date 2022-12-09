package lr3;

import java.util.Scanner;

public class example2b {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите название дня недели с заглавной буквы");
        String nameDay = id.nextLine();
        if (nameDay.equals("Понедельник"))
        {
            System.out.print("1");
        }
        else
        {
            if (nameDay.equals("Вторник"))
            {
                System.out.print("2");
            }
            else
            {
                if (nameDay.equals("Среда"))
                {
                    System.out.print("3");
                }
                else
                {
                    if (nameDay.equals("Четверг"))
                    {
                        System.out.print("4");
                    }
                    else
                    {
                        if (nameDay.equals("Пятница"))
                        {
                            System.out.print("5");
                        }
                        else
                        {
                            if (nameDay.equals("Суббота"))
                            {
                                System.out.print("6");
                            }
                            else
                            {
                                if (nameDay.equals("Воскресение"))
                                {
                                    System.out.println("7");
                                }
                                else
                                {
                                    System.out.println("Ошибка");
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}