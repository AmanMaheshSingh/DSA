//Leetcode : 852
//Peak Index in a Mountain Array
package Array;

public class PeakIndex {
    public static int peakIndexInMountainArray(int[] arr) {
        int peak=0;
        for(int i = 0;i<arr.length;i++ ){
            if(arr[peak]<arr[i]){
                peak = i;
            }
        }
        return peak;
    }
    public static void main() {
    int[] arr={0,2,3,0};
    System.out.println(peakIndexInMountainArray(arr));
    }
}
