package lr2;

import java.util.Scanner;

public class lesson4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Введите число");
		int num = in.nextInt();
		
		if (num >= 5) {
			if (num <= 10){
				System.out.println("число входит в диапазон от 5 до 10 включительно");
			}
		}
		else{
				System.out.println("число не входит в диапазон от 5 до 10 включительно");
			}
	}
}
