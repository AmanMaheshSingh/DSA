//LeetCode : 540
//Single Element in a Sorted Array

public class SingleElement {
    static void main(String[] args) {
        int[] nums = {1,1,2,2,5,5,7,7,8,8,9};
        int ans = singleNonDuplicate(nums);
        System.out.println(ans);
    }

    public static int singleNonDuplicate(int[] nums) {
        int start = 0 , end = nums.length - 1;
        while(start<end){
            int mid = start + (end - start) / 2;
            if(mid % 2 == 1){
                mid--;
            }
            if(nums[mid]==nums[mid+1]){
                start = mid +2;
            }else{
                end = mid;
            }
        }
        return nums[start];
    }
}
