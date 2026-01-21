//LeetCode : 34
//Find First and Last Position of Element in Sorted Array
import java.util.Arrays;

public class firstLast {
    public static void main(String[] args){
        int[] nums = {1,2,3,7,7,7,7,8,9};
        int target = 7;
        int ans[] = searchRange(nums,target);
        System.out.println("The First and Last Position of Element in Sorted Array is : "+Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(nums,target,true);
        ans[1] = search(nums,target,false);
        return ans;
    }

    public static int search(int[] nums , int target ,boolean searchStartIndex){
        int start = 0 , end = nums.length -1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if (target<nums[mid]){
               end = mid - 1;
            }else if (target>nums[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                if(searchStartIndex){
                    end =mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
