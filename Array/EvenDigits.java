//LeetCode : 1295
//Find Numbers With Even Number of Digits

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0, finalCount = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }else{
                while(nums[i]!=0){
                    count++;
                    nums[i]=nums[i] / 10;
                }
            }
            if(count%2==0){
                finalCount++;
            }
            count=0;
        }
        return finalCount;
    }
}
