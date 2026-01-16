//Leetcode 1480
//Running Sum of 1d Array
package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSum {
    public static int[] runningSum(int[] nums) {
        int[] run=new int[nums.length];
        for(int i = 0 ;i<nums.length;i++){
            for(int j=0;j<=i;j++){
                run[i]+=nums[j];
            }
        }
        return run;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}