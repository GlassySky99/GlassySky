package lr3;

import java.util.Arrays;

public class example7 {
    public static void main (String[] args){
        int size = 10;
        char[] nums = new char[size];
        char one ='a';

        for (int i = 1; i < nums.length; i++){
            nums[i] = one;
            one+=2;
                    System.out.println(nums[i] + "\t");
        }
        System.out.println(); // пробел
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(nums[i] + "\t");
        }
        }
    }