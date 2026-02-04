//LeetCode : 1480
//Running Sum of 1d Array
import java.util.Arrays;

public class RunningSumArray {
    public static void main() {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    public static int[] runningSum(int[] nums) {
        int[] rS = new int [nums.length] ;
        for(int i = 0; i<nums.length ; i++){
            for(int j = 0; j<=i ; j++){
                rS[i]+=nums[j];
            }
        }
        return rS;
    }
}
