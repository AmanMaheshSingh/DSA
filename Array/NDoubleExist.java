//LeetCode : 1346
//Check If N and Its Double Exist

public class NDoubleExist {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3};
        System.out.println(checkIfExist(arr));
        int[] arr2 = {3, 1, 7, 11};
        System.out.println(checkIfExist(arr2));
    }

    public static boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if (i != j && arr[i] == arr[j]*2) {
                    return true;
                }
            }
        }
        return false;
    }
}
