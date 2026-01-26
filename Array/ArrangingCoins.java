//LeetCode : 441
//Arranging Coins

public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(arrangeCoins(n));
    }

    public static int arrangeCoins(int n) {
        long start = 0,end = n;
        while(start<=end){
            long mid = start + (end-start) / 2;
            long coins = mid * (mid + 1) / 2;
            if(coins==n){
                return (int) mid;
            }else if(coins<n){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return (int) end;
    }
}
