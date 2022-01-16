package dataStructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Integers {

    public static int reverseNumber(int number){

        int reverse = 0;
        while (number!=0){
            int pop = number % 10;
            number /= 10;
            reverse = reverse * 10 + pop;
        }
        System.out.println("The reversed number is: " +reverse);
        return reverse;
    }

    public static int removeDuplicates(int[] nums) {
        int count = nums.length;
        int i = 0;
        for (int j=1;j < count;j++){

            if (nums[j] != nums[i]){
                i++;
                nums[i] =  nums[j];

            }
        }

        return i+1;

    }



    public static void main(String[] args)
        {
//            reverseNumber(675);
//            System.out.println("The unique number count is: " +removeDuplicates(new int[]{0,0,0,0,1,1,1,5,6,7,7}));
//              twoSum(new int[]{2,7,11,15}, 9);+


        }
    }
