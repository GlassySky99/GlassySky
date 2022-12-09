package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example10 {
    public static void main (String[] args){
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = id.nextInt();

        System.out.println("Размер массива равен " + size);
        int[] nums = new int[size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(200);
        }
        Arrays.sort(nums);
        System.out.println("Произведена сортировка массива");
        for(int i = nums.length - 1; i >= 0; i--){
            System.out.print(nums[i] + " ");
        }
    }
}
