package dataStructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WorkingWithArrays {

    public static void secondHighestSalary (int[] salaries){
        System.out.println("The Salaries passed are: " +Arrays.toString(salaries));
        Arrays.sort(salaries);
        int sal = salaries[1];
        System.out.println("The Second Highest Salary is: " +sal);
          }

    public static int[]  twoSum(int[] nums, int target) {
        int count = nums.length;
        int[] result = new int[2];
        Map<Integer, Integer> trackerMap = new HashMap<>();
        for (int i = 0; i < count; i++) {
            trackerMap.put(nums[i], i);
        }
        for (int i = 0; i < count; i++) {
            int difference = target - nums[i];
            if (trackerMap.containsKey(difference) && trackerMap.get(difference) != i) {
                result[0] = i;
                result[1] = trackerMap.get(difference);
                System.out.println("The two sum number is: " + Arrays.toString(result));
                return result;
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }


    public static int findKthLargest(int[] nums, int k) {

        int count = nums.length;
        Arrays.sort(nums);
        int result = nums[count-k];
        System.out.println( "kth highest number is: " + result);

        return result;
    }


    public static void main(String[] args)

    {
//      secondHighestSalary(new int[]{111, 5785, 675, 11, 247});
        findKthLargest(new int[]{3,2,1,5,6,4}, 2);

    }
}
