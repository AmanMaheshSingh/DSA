//LeetCode : 81
//Search in Rotated Sorted Array II

public class RSA2 {
    static void main(String[] args) {
        int[] nums={2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));
        int[] nums2 = {2,5,6,0,0,1,2};
        int target2 = 3;
        System.out.println(search(nums2,target2));
    }

    public static boolean search(int[] nums, int target) {
        int start = 0,end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[mid]==nums[start] && nums[mid]==nums[end]){
                start++;
                end--;
            }else if(nums[start]<=nums[mid]){
                if (nums[start] <= target && target < nums[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(nums[mid]<target && target<=nums[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}
