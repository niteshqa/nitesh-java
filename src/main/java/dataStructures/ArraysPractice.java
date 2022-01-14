package dataStructures;

import java.util.Arrays;

public class ArraysPractice {

    public static void secondHighestSalary (int[] salaries){
        System.out.println("The Salaries passed are: " +Arrays.toString(salaries));
        Arrays.sort(salaries);
        int sal = salaries[1];
        System.out.println("The Second Highest Salary is: " +sal);
          }


    public static void main(String[] args)
    {
        secondHighestSalary(new int[]{111, 5785, 675, 11, 247});

    }
}
