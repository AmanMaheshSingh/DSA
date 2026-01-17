//LeetCode : 852
//Peak Index In a Mountain Array

public class peakIndexBS {
    public static void main(String[] args){
        int arr[] = new int[]{0,1,2,1,0};
        int ans = peakIndexInMountainArray(arr);
        System.out.println("The Peak Index in the Mountain Array is : "+ans);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0 , end = arr.length - 1;
        while (start<end){
            int mid = start + (end - start) / 2;
            if(arr [mid] < arr[mid+1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return end;
    }
}
