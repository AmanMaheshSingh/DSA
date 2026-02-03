//LeetCode : 1929
//Concatenation of Array
import java.util.Arrays;

public class ConcatenationArray {
    public static void main() {
        int[] nums = {1,2,1};
        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] getConcatenation(int[] nums) {
        int n = 0 ;
        int[] ans = new int[2*nums.length];
        for(int i = 0;i<2*nums.length;i++){
            if(n==nums.length){
                n=0;
            }
            ans[i]=nums[n];
            n++;
        }
        return ans;
    }
}
