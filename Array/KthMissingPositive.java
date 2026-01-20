//LeetCode : 1539
//Kth Missing Positive Number

public class KthMissingPositive {
    public static void main(String[] args){
        int[] arr = new int[] {1,2,4,5,6,8,9,12};
        int k = 4;
        int ans = findKthPositive(arr,k);
        System.out.println("Kth Missing Positive Number is : "+ans);
    }

    public static int findKthPositive(int[] arr, int k) {
        int start = 0 , end = arr.length - 1 ;
        while(start<=end){
            int mid = start + (end - start) / 2;
            int miss = arr[mid] - (mid + 1);
            if(miss<k){
                start = mid + 1;
            }else {
                end = mid - 1 ;
            }
        }
        return start + k;
    }
}
