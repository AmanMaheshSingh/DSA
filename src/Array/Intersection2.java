//Leetcode : 350
//Intersection of Two Arrays
package Array;

import java.util.Arrays;

public class Intersection2 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int max = Math.min(nums1.length,nums2.length);
        int[] temp = new int[max];
        int index = 0;
        for(int i = 0;i<nums1.length;i++){
            int pos = FindAndMark(nums2,nums1[i]);
            if(pos != -1){
                temp[index++]=nums1[i];
            }
        }
        int[] result= new int[index];
        for(int i = 0;i<index;i++){
            result[i]=temp[i];
        }
        return result;
    }

    private static boolean exist(int[] arr,int target){
        for(int x : arr){
            if(x == target) return true;
        }
        return false;
    }

    private static int FindAndMark(int[] arr,int target){
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]==target){
                arr[i] = Integer.MIN_VALUE;
                return i;
            }
        }
        return -1;
    }

    public static void main() {
        int[] nums1 = {1,2,3,2,4} ;
        int[] nums2 = {2,2,4,3,5};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
}
