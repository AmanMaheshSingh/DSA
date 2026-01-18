//LeetCode : 162
//Find Peak Element

public class PeakElement {
    public static void main(String[] args){
        int arr[] = new int[]{0,1,2,3,4,3,2,1,0};
        int ans = findPeakElement(arr);
        System.out.println("The Peak Element in the Array is : "+ans);
    }

    public static int findPeakElement(int[] nums) {
        int start = 0 , end = nums.length - 1;
        while (start<end){
            int mid = start + (end - start) / 2;
            if(nums[mid]<nums[mid+1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
