//LeetCode : 1608
//Special Array With X Elements Greater Than or Equal X

public class XGreaterEqualX {
    public static void main(String[] args) {
        int[] nums = {3, 5};
        System.out.println(specialArray(nums));
        int[] nums2 = {0, 0};
        System.out.println(specialArray(nums2));
    }

    public static int specialArray(int[] nums) {
        int n = nums.length;
        for(int x = 0 ;x <= n;x++){
            int count = 0;
            for(int i = 0;i < n;i++){
                if(nums[i]>=x){
                    count++;
                }
            }
            if(count==x){
                return x;
            }
        }
        return -1;
    }
}
