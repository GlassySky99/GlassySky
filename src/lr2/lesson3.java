package lr2;

import java.util.Scanner;

public class lesson3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Введите число");
		int num = in.nextInt();
		
		if (num % 4 == 0) {
			if (num > 10){
				System.out.println("число делится на 4 и оно больше 10");
			}
		}
		else{
				System.out.println("число не делится на 4 либо меньше 10");
			}
	}
}
				