package lr11;

import java.util.Scanner;

public class Example2 {
    static void binary(int i, String val_2) {
        if (i>0)
        {
            binary(i/2,val_2);
            val_2+=(i%2);
        }
        System.out.print(val_2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int val_10 = in.nextInt();
        String str = "";
        binary(val_10,str);


    }
}
