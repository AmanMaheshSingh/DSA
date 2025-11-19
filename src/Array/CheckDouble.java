//Leetcode : 1346
//Check If N and Its Double Exist
package Array;

public class CheckDouble {
    public static boolean checkIfExist(int[] arr) {
        for(int i = arr.length-1;i>=0;i-- ){
            for(int j = 0;j<arr.length;j++){
                if(i != j && arr[i] == (2*arr[j]))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,2,5};
        System.out.println(checkIfExist(arr));
    }
}
