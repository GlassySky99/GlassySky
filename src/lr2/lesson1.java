package lr2;

import java.util.Scanner;

public class lesson1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Введите число");
		int num = in.nextInt();
		
		if (num % 3 == 0){
			System.out.println("число делится на 3");
		}
		else{
			System.out.println("число не делится на 3");
		}
	}

}
