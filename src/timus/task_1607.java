//Петя любит ездить на такси. Для него это не только удовольствие от быстрой и комфортной поездки, но и возможность всласть поторговаться с таксистом о цене проезда. Торг между Петей и таксистами всегда происходит по одному и тому же сценарию:
//— Мне в аэропорт, заплачу 150 рублей.
//— Нет, за 150 не повезу, поехали за 1000.
//— Да ты что?! У меня и нет столько! Согласен за 200.
//— Ты смеешься? Давай хотя бы за 900.
//— Ну хорошо, дам 250.
//— Да ты хоть знаешь, сколько бензин стоит? 800 и поехали!
//…
//Этот диалог продолжается до тех пор, пока они не сойдутся в цене. Петя всегда увеличивает свою цену на одну и ту же сумму, а таксист таким же образом снижает ее. Таксист не станет называть цену ниже той, которую предложит Петя. В этом случае он согласится с его ценой. Аналогичным образом поступит и Петя.
//Исходные данные
//В единственной строке даны 4 целых числа: a — стартовая цена Пети, b — надбавка Пети к своей цене, c — стартовая цена таксиста, d — скидка таксиста к своей цене (1 ≤ a, b, c, d ≤ 10000).
//Результат
//Выведите сумму, которую Петя заплатит за проезд.
package timus;

import java.util.Scanner;

public class task_1607 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int x=in.nextInt();
        int y=in.nextInt();
        while (x>a){
            a+=b;
            if(a>x)a=x;
            x-=y;
        }
        System.out.println(Math.max(x, a));
    }
}
