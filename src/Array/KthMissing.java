package Array;

public class KthMissing {
    private static int findKthPositive(int[] arr, int k) {
        int current = 1;
        int missing = 0;
        int i = 0 ;
        while(missing<k){
            if(i<arr.length && arr[i]==current){
                i++;
            }else{
                missing++;
                if (missing == k)
                    return current;
            }
            current++;
        }
        return -1;
    }

    public static void main() {
        int[] arr={2,3,4,7,8,9};
        int target = 5;
        System.out.println(findKthPositive(arr,target));
    }
}
