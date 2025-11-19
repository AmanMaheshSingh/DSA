//Leetcode : 349
//Intersection of Two Arrays
package Array;

import java.util.Arrays;

public class Intersection1 {
        public static int[] intersection(int[] nums1, int[] nums2) {
            int max = Math.min(nums1.length,nums2.length);
            int[] temp = new int[max];
            int index = 0;
            for(int i = 0;i<nums1.length;i++){
                if(exist(nums2,nums1[i])){
                    if(!exists(temp,nums1[i],index)){
                        temp[index++]=nums1[i];
                    }
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

        private static boolean exists(int[] arr,int target ,int size) {
            for (int i = 0; i < size; i++) {
                if (arr[i] == target) return true;
            }
            return false;
        }

        public static void main (String args[]){
            int[] nums1 = {1,2,3,2,4} ;
            int[] nums2 = {2,2,4,3,5};
            System.out.println(Arrays.toString(intersection(nums1,nums2)));
        }
}
