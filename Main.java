import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    /*
    Given an array of numbers, return the sum of all numbers Except for the largest number.
     Steps: 1. find the max
            Create

    I/P = [1,2,3,4]
    O/P = 6

     I/P = [5,43,1,6]
    O/P = 12

    * */


    public static void main(String[] args) {
        int[] numbers = {5, 43, 1, 6};
        System.out.println(sumOfAllNumsExceptLargest(numbers));

        int [] num1 = {5, 43, 1, 6};
        int [] num2 ={3,7,9,10,57,9};
        System.out.println(maxProductOfTwoNums(num2));
        System.out.println(maxProductOfTwoNums(num1));

    }

    public static int sumOfAllNumsExceptLargest(int[] nums) {
        int currentLargest = nums[0];
        int locationOfLargestInt = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (currentLargest < nums[i]) {
                currentLargest = nums[i];
                locationOfLargestInt = i;


            }

        }
        for (int i = 0; i < nums.length; i++) {
            if (i != locationOfLargestInt) {
                sum += nums[i];
            }

        }
        return sum;
    }
// Efficient way to do this

    public static int sumOfAllNumsExceptLargestEFFICIENT(int[] nums) {
        int currentLargest = nums[0]; // 4
        int sum = 0; // 10
        for (int i = 0; i < nums.length; i++) {
            // If statement finds the largest value
            if (currentLargest < nums[i]) { // [5,43,1,6]
                currentLargest = nums[i];
            }
            // Getting the sum of the entire array
            sum += nums[i];
           // sum = sum + nums[i];
        }
        return sum-currentLargest;
    }

 // Max product of two concequative numbers

    public static int maxProductOfTwoNums(int[] nums) {
        int currentLargest = nums[0];
        int currentLargest2 = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            // If statement finds the largest value
            if (currentLargest < nums[i]) { // [5,43,1,6]
                currentLargest = nums[i];


            }

            for(int j=i+1; j<nums.length; j++){
                if(nums[i]>nums[j]) {
                    //currentLargest2 = nums[i];
                   currentLargest2 = nums[j];

                }
            }
        }
        return (currentLargest) * ((currentLargest2));
    }
}

