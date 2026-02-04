//LeetCode : 1672
//Richest Customer Wealth
import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(nums));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i < accounts.length ; i++){
            for(int j = 0 ; j < accounts[i].length ; j++){
                sum+=accounts[i][j];
            }
            if(max<sum){
                max = sum;
            }
            sum = 0;
        }
        return max;
    }
}
