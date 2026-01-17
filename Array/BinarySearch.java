public class BinarySearch {
    public static void main(String[] args){
        int nums[] = new int[]{1,3,5,6,9,12,24};
        int targ = 9;
        int ans = search(nums,targ);
        System.out.println("The target is on index : "+ans+" \nIf -1 is Showing target does not exist in Array");
    }

    public static int search(int[] nums, int target) {
        int start = 0 , end = nums.length - 1;
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
