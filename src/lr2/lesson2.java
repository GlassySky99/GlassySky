package lr2;

import java.util.Scanner;

public class lesson2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Введите число");
		int num = in.nextInt();
		
		if (num % 5 == 2){
			System.out.println("при делении на 5 в остатке 2");
		}
		else{
			System.out.println("при делении на 5 в остатке нет 2");
		}
		if (num % 7 == 1){
			System.out.println("при делении на 7 в остатке 1");
		}
		else{
			System.out.println("при делении на 7 в остатке нет 1");
	}
}
}