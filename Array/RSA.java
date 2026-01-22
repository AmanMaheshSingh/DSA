//LeetCode : 33
//Search in Rotated Sorted Array

public class RSA {
    public static void main() {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = search(nums,target);
        System.out.println("Index of Element in Rotated Sorted Array : "+ans);
    }

    public static int search(int[] nums, int target) {
        int pviot = findPviot(nums);
        if(pviot == -1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if (nums[pviot]==target){
            return pviot;
        }
        if(target>=nums[0]){
            return binarySearch(nums,target,0,pviot-1);
        }
        return binarySearch(nums,target,pviot+1,nums.length-1);
    }

    public static int findPviot(int[] nums) {
        int start = 0 , end = nums.length -1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]<=nums[start]){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target,int start ,int end) {
        while (start<=end){
            int mid = start + (end - start) / 2;
            if(target==nums[mid]){
                return mid;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
