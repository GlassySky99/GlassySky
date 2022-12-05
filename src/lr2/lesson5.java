package lr2;

import java.util.Scanner;

public class lesson5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Введите число");
		int num = in.nextInt();
		int a = num / 1000 % 10;
		System.out.println("в числе " + a + " тысяч");
	}
}
