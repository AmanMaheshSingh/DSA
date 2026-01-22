//LeetCode : 367
//Valid Perfect Square

public class ValidPerfectSquare {

    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            long sq = mid * mid;

            if (sq == num) {
                return true;
            } else if (sq < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}

