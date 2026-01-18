//LeetCode : 35
//Search Insert Position

public class insertPosition {
    public static void main (String[] args){
        int[] nums = new int[] {1,2,3,4,5,6,7,44,55,66};
        int target = 45;
        int ans = searchInsert(nums,target);
        System.out.println("The Index That It should Exist on or Exists is : "+ans);
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0,end = nums.length -1;
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]<target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return start;
    }
}
