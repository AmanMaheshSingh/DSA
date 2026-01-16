//LeetCode : 69
//Sqrt(x)
package Array;
import java.util.*;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int ans = mySqrt(n);
        System.out.println("Square Root is : "+ans);
    }
    public static int mySqrt(int x) {
        if (x < 2) return x;

        int low = 1, high = x;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid <= x / mid) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;}
            }
        return ans;
    }
}



